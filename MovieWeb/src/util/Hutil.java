package util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Hutil {
	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		// ����Configuration���󣬶�ȡhibernate.cfg.xml�ļ�����ɳ�ʼ��
		Configuration config = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());
		StandardServiceRegistry ssr=ssrb.build();
		sessionFactory=config.buildSessionFactory(ssr);
	}
	
	//��ȡSessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//��ȡSession
	public static Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}
	
	//�ر�Session
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
}
