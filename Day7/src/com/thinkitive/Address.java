package com.thinkitive;

public class Address {
private String address;
private int pin;
private static final long SerialVersionUID=10l;

public Address(String address, int pin) {
	super();
	this.address = address;
	this.pin = pin;
}
public Address() {
	this.address = null;
	this.pin=0;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}




}
