package util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Movie;
import entity.Reviews;
import entity.User;

public class Test {
	static Movie m=null;
	static User u=null;
	
	List<User> user=new ArrayList<User>();
	List<Movie> movie=new ArrayList<Movie>();
	List<Reviews> reviews=new ArrayList<Reviews>();
	Session session=HibernateSessionFactory.getSession();
	
	public List<Movie> quaryMovie(){
		List<Movie> allMovie=new ArrayList<Movie>();
		String hql="from Movie";
		Query query=session.createQuery(hql);
		allMovie=query.list();
		return allMovie;
	}
	public Movie quaryMovieById(String id){
		int sid=Integer.parseInt(id);
		m=(Movie) session.get(Movie.class,sid);
		return m;
	}
	public List<Movie> cookieMovie(String list){
		List<Movie> twoMovie=new ArrayList<Movie>();
		if(list!=null&&list.length()>0){
			String[] arr = list.split(",");
			if(arr.length>=2){
				for(int i=arr.length-1;i>=arr.length-2;i--){
					twoMovie.add(this.quaryMovieById(arr[i]));
				}
			}else{
				for(int i=arr.length-1;i>=0;i--){
					twoMovie.add(this.quaryMovieById(arr[i]));
				}
			}
		}
		return twoMovie;
	}
	public User quaryUserById(String id){
		int uid=Integer.parseInt(id);
		u=(User) session.get(User.class, uid);
		return u;
	}
	public String quaryUserId(String name,String pass){
		int uid=0;
		String hql = "from User";
		Query query = session.createQuery(hql); 
		user= query.list();
		for (User p : user) {
			if(name.equals(p.getUname())){
				if(pass.equals(p.getUpass()))
					uid=p.getUid();
			}
		}
		return uid+"";
	}
	public boolean quaryUser(String name,String pass){
		boolean flag=true;
		String hql = "from User";
		Query query = session.createQuery(hql);
		user = query.list();
		for (User p : user) {
			if(name.equals(p.getUname())){
				if(pass.equals(p.getUpass()))
					return flag=true;
			}else{
				return flag=false;
			}
		}
		return flag;
	} 
	public List<Movie> movieByName(String mname){
		String hql = "from Movie as a where a.mname like :name";
		Query query = session.createQuery(hql);
		query.setString("name", "%"+mname+"%");   
		movie= query.list();
		return movie;		
	}
	public void addUser(String name,String pass,String email){
        Transaction ts = session.getTransaction();  
        try{  
                  ts.begin();                    
                  User s = new User();
                  s.setUqq(null);
                  s.setUtel(null);
                  s.setUname(name);
                  s.setUpass(pass);
                  s.setUemail(email);
                  session.save(s);      
                  ts.commit();  
        }catch(Exception e){  
                  e.printStackTrace();  
                  ts.rollback();  
        }  
	}
	public void addReviews(String reviews,String mid,String uid){
		System.out.println(reviews);
        Transaction ts = session.getTransaction();
        ts.begin();
        System.out.println("ok");
        
        Movie m1=this.quaryMovieById(mid);
        User u1=this.quaryUserById(uid);
        Reviews r=new Reviews();
        r.setMovie(m1);
        r.setUser(u1);
        r.setRmess(reviews);
        session.save(u1);
		session.save(m1);
		session.save(r);
		ts.commit();
	}
	public String countAvg(String f,String mid,String uid){
		float avg=0;
		int fi=Integer.parseInt(f);
		//通过电影名和用户名查值
		String hql = "from Reviews r join r.movie m join r.user u where m.mno=? and u.uid=?";
		Query query = session.createQuery(hql);
		query.setString(0, mid);
		query.setString(1, uid);
		Reviews r=new Reviews();
		Movie m1=this.quaryMovieById(mid);
        User u1=this.quaryUserById(uid);
		List<Object[]> list= (List<Object[]>) query.list();  
        //对象导航查询  
        for(Object[] o:list){  
            System.out.println(o[0]+","+o[1]); 
            r=(Reviews)o[0];
        }  
		//用数据库取得的值加上fi再除以count+1,所以数据库加两个属性count，sum,并且执行数据库更新操作
        avg=(r.getRsum()+fi)/(r.getRcount()+1);
        String savg=avg+"";
        Transaction ts = session.getTransaction(); 
        ts.begin();
        r.setMovie(m1);
        r.setUser(u1);
        r.setRcount(r.getRcount()+1);
        r.setRsum(r.getRsum()+fi);
        session.save(u1);
		session.save(m1);
		session.save(r);
		ts.commit();
		return savg;
	}
	
	public static void main(String[] args) {
		m=new Movie();
		u = new User();
		Test t=new Test();
		//t.countAvg("2");
		//t.quaryUser("Bob", "123");
		//m=t.quaryMovie();
		//t.addReviews("w");
		//System.out.println(m.getMactor());
//		t.movieById("Without");
	}
}
