package com.thinkitive;

import java.util.HashMap;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private List<String> list;
	private HashMap<Integer, String> hmap;
	private Address address;
	
	public Employee() 
	{
		this.id = 0;
		this.name = null;
		this.salary = 0;
		
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	public List<String> getList() {
		return list;
	}
	public HashMap<Integer, String> getHmap() {
		return hmap;
	}
	public void setHmap(HashMap<Integer, String> hmap) {
		this.hmap = hmap;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", list=" + list + ", hmap=" + hmap
				+ ", address=" + address + "]";
	}
	public void hello() 
	{
		System.out.println("Hello");
	}
	//instantiation usng static method 
	public static Employee  getinstance() {
		System.out.println("method called");
		return new Employee();
	}
}
