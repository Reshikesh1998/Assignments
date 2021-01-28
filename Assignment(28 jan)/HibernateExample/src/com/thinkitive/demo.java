package com.thinkitive;

public class demo {
	public static void main(String[] args) {
		MyDbConnection d=new MyDbConnection();
		d.InsertEmployee(13, "r", 1);
		d.InsertEmployee(23, "re", 12);
		d.InsertEmployee(33, "res", 123);
		d.InsertEmployee(43, "resh", 1234);
		d.InsertEmployee(53, "reshi", 12345);
		System.out.println("inserted in to the table");
		d.updateEmployee(33,"his",223);
		System.out.println("Employee updated");
		d.deleteEmployee(33,"his",223);
		d.displayEmployee();
	}

}


