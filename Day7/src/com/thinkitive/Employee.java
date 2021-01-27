package com.thinkitive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	int eid =0;
	private String ename;
	private int esalary;
	private String address;
	private int pin;
	private static final long SerialVersionUID=10l;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public Employee(int eid, String ename, int esalary, String address, int pin) {
		super();
		Address addr = new Address(address, pin);
		this.address = addr.getAddress();
		this.pin = addr.getPin();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee() {
		Address addr = new Address();
		this.address = addr.getAddress();
		this.pin = addr.getPin();
		this.eid = 0;
		this.ename = null;
		this.esalary = 0;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + ", pin="
				+ pin + "]";
	}
	public void doSerializable() {
		
		
		try {
			FileOutputStream fos = new FileOutputStream("demo.serial");
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(this);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public Employee doDeserialize() {
		Employee e =null;
		
		try {
		
			FileInputStream fis = new FileInputStream("demo.serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e = (Employee)ois.readObject();
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
		
		
	}
}
