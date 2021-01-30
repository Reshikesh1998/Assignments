package com.thinkitive;

import java.util.List;

public class Employee {
	private String ename;
	private int empid;
	private int salary;
	private List<Address> addresses;
	public Employee() {
		
	}
	public Employee(String ename, int empid, int salary, List<Address> addresses) {
		super();
		this.ename = ename;
		this.empid = empid;
		this.salary = salary;
		this.addresses = addresses;
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
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", empid=" + empid + ", salary=" + salary + ", addresses=" + addresses
				+ "]";
	}
	


}
