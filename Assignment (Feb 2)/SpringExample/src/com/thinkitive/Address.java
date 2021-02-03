package com.thinkitive;

public class Address {

	private int pin;
	private  String addr;
	

	public Address() {
		super();
		this.pin = 0;
		this.addr = null;
	}
	
	public Address(int pin, String addr) {
		super();
		this.pin = pin;
		this.addr = addr;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}



	public void hello() {
		System.out.println("hello inside address");
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pin;
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
		Address other = (Address) obj;
		if (pin != other.pin)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Address [pin=" + pin + ", addr=" + addr + "]";
	} 
}
