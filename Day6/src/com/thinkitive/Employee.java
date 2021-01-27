package com.thinkitive;

public class Employee {
	
	
	int eid =0;
	private String ename;
	private int esalary;
	String Addr;
	int pin;
	

public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	


private Employee(String ename, int esalary , int eid) {
		this.esalary =esalary;
		this.ename=ename;
		this.eid =eid;
	}


public static Employee CreateObject(String ename, int esalary, int eid) 
{
	
	Employee e= new Employee(ename, esalary,eid);
	return e;
	
	}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
	result = prime * result + esalary;
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
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	if (esalary != other.esalary)
		return false;
	return true;
}


@Override
public String toString() {
	return "Employee [ename=" + ename + ", esalary=" + esalary + "]";
}



	
	
	
}
