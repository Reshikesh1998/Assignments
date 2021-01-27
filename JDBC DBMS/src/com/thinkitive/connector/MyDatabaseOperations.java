package com.thinkitive.connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseOperations {

	MyConnection db = new MyConnection();
	Statement st;
	PreparedStatement ps;

	public void insertEmp(int id, String name) {

		try {
			ps = db.getPreparedStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, 1000);
			ps.execute();

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteEmp(int id) {

		try {
			ps = db.getPreparedStatement("delete from employee where Id=?");
			ps.setInt(1, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmp(int id, String name) {

		try {
			ps = db.getPreparedStatement("update employee set FirstName=? where Id=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayEmp() {
		st = db.getStatement();

		try {
			ResultSet rs = st.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+ rs.getInt(3));
			}

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}