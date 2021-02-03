package com.thinkitive;

public class Employee {
	private String ename;
	private int esalary;
	private static int empid;
	final int medical = 1000;
	final int pt = 200;
	private double hra;
	private double pf;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String ename, int esalary) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.hra = 0.5* esalary;
		this.pf = 0.12 * esalary;
	}
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
	public static int getEmpid() {
		return empid;
	}
	public static void setEmpid(int empid) {
		Employee.empid = empid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
		return true;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", esalary=" + esalary + ", medical=" + medical + ", pt=" + pt + ", hra="
				+ hra + ", pf=" + pf + "]";
	}
		
	
	
	public double grosssalary()
	{
		return (esalary+hra+medical);
	}
	public double netsalary() 
	{
		return (grosssalary()-pf-pt);
	}
	
	public double hra () 
	{
		this.hra = 0.5*esalary;
		return this.hra;
	}
	public double pf () 
	{
		this.pf = 0.12*esalary;
		return this.pf;
	}
}
