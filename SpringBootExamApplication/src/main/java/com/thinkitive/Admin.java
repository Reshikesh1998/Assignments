package com.thinkitive;

public class Admin {
	private String uname;
	private String upass; 
	private int id;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
		
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Admin [uname=" + uname + ", upass=" + upass + ", id=" + id + "]";
	}
	

}
