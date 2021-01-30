package com.thinkitive;

public class Employee {
	private String ename;
	private int empid;
	private int salary;
	private Address address;
	public Employee() {
		
	}
	public Employee(String ename, int eid, int salary, Address address) {
		super();
		this.ename = ename;
		this.empid = eid;
		this.salary = salary;
		this.address = address;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int eid) {
		this.empid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + empid + ", salary=" + salary + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
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
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	

}
