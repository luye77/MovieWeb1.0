package entity;

import java.util.HashSet;
import java.util.Set;

public class User {

	private int uid;
	private String uname;
	private String upass;
	private String uqq;
	private String uemail;
	private String utel;
	private Set<Reviews> reviews=new HashSet<Reviews>(); 
	public Set<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(Set<Reviews> reviews) {
		this.reviews = reviews;
	}
	//private Set<Movie> movie=new HashSet<Movie>();
	public User(){}
	public User(String name){
		this.uname=name;
	}
//	public Set<Movie> getMovie() {
//		return movie;
//	}
//	public void setMovie(Set<Movie> movie) {
//		this.movie = movie;
//	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUqq() {
		return uqq;
	}
	public void setUqq(String uqq) {
		this.uqq = uqq;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
}
