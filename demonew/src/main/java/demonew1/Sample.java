package demonew1;

import java.sql.*;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
	PreparedStatement p = con.prepareStatement("create database Boss1");
////	PreparedStatement p = con.prepareStatement("create table Sample.Student(id integer primary key, name varchar(40) unique not null,Addres varchar(100))"); 
//		PreparedStatement p = con.prepareStatement("insert into Sample.Student  values(?,?,?)");	
//		System.out.println("enter id");
//		p.setInt(1,sc.nextInt());
//		System.out.println("enter name");
//		p.setString(2,sc.next());
//		System.out.println("ennter address");
//		p.setString(3,sc.next());
		
		
	boolean e = p.execute();
//		System.out.println("batabase created");
System.out.println(e);

	}
}
