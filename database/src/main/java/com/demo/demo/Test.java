package com.demo.demo;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Microsoft.database.dbconnection;

public class Test {
	final static String insert="insert into data"+"(Ename, city, salary) values (?, ?, ?)";
//	final static String update="update data set city=?,salary=?, Ename=? where Ename=?";
    public static void main(String[] args) throws SQLException, IOException{
    	PreparedStatement ps=dbconnection.data().prepareStatement(insert);
    	Scanner s1=new Scanner(System.in);
    	System.out.println("Enter the name of Employee: ");
 	    String name=s1.next();
    	System.out.println("Enter the city of Employee: ");
    	String city=s1.next();
    	System.out.println("Enter the salary of Employee: ");
    	float salary=s1.nextFloat();
    	ps.setString(1, name);
    	ps.setString(2, city);
    	ps.setFloat(3, salary);
    	ps.executeUpdate();
    	
//     	System.out.println("Data inserted successfully");
    	System.out.println("Data updated successfully");
    }
}
