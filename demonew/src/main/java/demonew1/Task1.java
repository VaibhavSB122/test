package demonew1;

import java.sql.*;

public class Task1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/task1", "root", "root");
		// PreparedStatement p = con.prepareStatement("create table lucky_girl.luckypoints (slno integer primary key ,name varchar(50),SN_num varchar(20), UE_num varchar(20),points integer)");
		 PreparedStatement p = con.prepareStatement("create database student");
		// integer primary key ,name varchar(50),phone_num long)");
		//PreparedStatement p = con.prepareStatement("insert into detailes values(12,'pavi',8431626344)");
		//PreparedStatement p = con.prepareStatement("update Detailes set gender= 'male' where id=11");
		//PreparedStatement p = con.prepareStatement("");

		boolean e = p.execute();
		System.out.println(e);
		System.out.println("database connection");

	}
}
