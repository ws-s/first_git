package entity;

public class student {
	private int sid;
	private String sname;
	private String sex;
	private String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public student(int sid, String sname, String sex, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.address = address;
	}
	public student() {
		super();
	}
	public student(String sname, String sex, String address) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.address = address;
	}
	
}
