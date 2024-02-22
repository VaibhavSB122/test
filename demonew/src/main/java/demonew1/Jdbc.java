package demonew1;

import java.sql.*;

public class Jdbc {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
	//PreparedStatement st = con.prepareStatement("create table emp(id integer,password varchar(20),name varchar(20), phno integer )");
	PreparedStatement st1 = con.prepareStatement("insert into emp values(1,'vaibhav')");
//PreparedStatement st2 = con.prepareStatement("insert into emp1 values(3,'vai',988078)");
PreparedStatement st2 = con.prepareStatement(" truncATE emp1");
//DriverManager.getConnection("jdbl:mysql:// localhost:3360/demo","root","root");  
//	boolean e = st1.execute();
	boolean e1 = st2.execute();

	con.close();
	System.out.println(e1);
	System.out.println("database created");
	}
	
	}
