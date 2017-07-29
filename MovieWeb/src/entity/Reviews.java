package entity;

public class Reviews {

	private int rid;
	private int uid;
	private int mno;
	private int rcount;
	private int rsum;
	public int getRcount() {
		return rcount;
	}
	public void setRcount(int rcount) {
		this.rcount = rcount;
	}
	public int getRsum() {
		return rsum;
	}
	public void setRsum(int rsum) {
		this.rsum = rsum;
	}
	private String rmess;
	private Movie movie;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getRmess() {
		return rmess;
	}
	public void setRmess(String rmess) {
		this.rmess = rmess;
	}
}
