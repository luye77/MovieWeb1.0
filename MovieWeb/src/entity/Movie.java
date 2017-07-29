package entity;

import java.util.HashSet;
import java.util.Set;

public class Movie {
	private int mno;
	private String mname;
	private String mtype;
	private String mcoun;
	private String mdir;
	private String mactor;
	private String mdescribe;
	private String mpic;
	private String mpublished;
	//private Set<User> user=new HashSet<User>();
	private Set<Reviews> reviews=new HashSet<Reviews>();
	public Set<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(Set<Reviews> reviews) {
		this.reviews = reviews;
	}
	public Movie(){}
	public Movie(String name){
		this.mname=name;
	}
//	public Set<User> getUser() {
//		return user;
//	}
//	public void setUser(Set<User> user) {
//		this.user = user;
//	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getMcoun() {
		return mcoun;
	}
	public void setMcoun(String mcoun) {
		this.mcoun = mcoun;
	}
	public String getMdir() {
		return mdir;
	}
	public void setMdir(String mdir) {
		this.mdir = mdir;
	}
	public String getMactor() {
		return mactor;
	}
	public void setMactor(String mactor) {
		this.mactor = mactor;
	}
	public String getMdescribe() {
		return mdescribe;
	}
	public void setMdescribe(String mdescribe) {
		this.mdescribe = mdescribe;
	}
	public String getMpic() {
		return mpic;
	}
	public void setMpic(String mpic) {
		this.mpic = mpic;
	}
	public String getMpublished() {
		return mpublished;
	}
	public void setMpublished(String mpublished) {
		this.mpublished = mpublished;
	}
}
