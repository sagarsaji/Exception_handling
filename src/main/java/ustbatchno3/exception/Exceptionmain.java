package ustbatchno3.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import java.sql.*;

public class Exceptionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		exception e1 = new exception("984712645",23000,"sasi@gmail.com","lakoor pta","sasi","pta",001);
		
		
		System.out.println("Enter name : ");
		String s3 = n.next();
		e1.setEmpname(s3);
		
		
		System.out.println("Enter address : ");
		String s4 = n.next();
		e1.setAddress(s4);
		
		System.out.println("Enter salary : ");
		int sal = n.nextInt();
		e1.setSalary(sal);
		
		System.out.println("Enter id number : ");
		int idd = n.nextInt();
		e1.setEmpid(idd);
		
		System.out.println("Enter phone number : ");
		String s1 = n.next();
		e1.setPhno(s1);
		
		try {
			if(!e1.getPhno().matches("\\d{10}$")) 
				throw new invalidNumberExcep("invalid phone number");
			
			System.out.println("Enter email id : ");
			String s2 = n.next();
			e1.setEmailid(s2);
			
			try {
				if(!e1.getEmailid().matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]+$"))
					throw new emailexcept("email not in proper format");		
				
			}
			catch(Exception f) {
				System.err.println(f.getMessage());
			}
			
		}
		
		
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/sagar";
	    String username = "root";
	    String password = "pass@word1";
	    
	    try {
	    	Connection conn = DriverManager.getConnection(url, username, password);
	    	Statement stmt = conn.createStatement();
	    	
	    	 // Execute the CREATE TABLE statement
//		      String sql = "CREATE TABLE datas ("
//		                 + "phno varchar(20),"
//		                 + "salary int,"
//		                 + "emailid varchar(20),"
//		                 + "address varchar(255),"
//		                 + "empname varchar(20),"
//		                 + "location varchar(20),"
//		                 + "empid int"
//		                 + ")";
//		      stmt.executeUpdate(sql);
//	    	
	    	String ins = "insert into datas values (?,?,?,?,?,?,?)";
	    	
	    	PreparedStatement tabel = conn.prepareStatement(ins);
	    	
	    	tabel.setString(1,e1.getPhno());
	    	tabel.setInt(2, e1.getSalary());
	    	tabel.setString(3, e1.getEmailid());
	    	tabel.setString(4, e1.getAddress());
	    	tabel.setString(5, e1.getEmpname());
	    	tabel.setString(6, e1.getLocation());
	    	tabel.setInt(7, e1.getEmpid());
	    	
	    	tabel.executeUpdate();
	    	
	 //   	ResultSet rs = stmt.executeQuery("select * from datas");
	   // 	while(rs.next())
	    //		System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getInt(7));
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
//	    finally {
//	    	System.out.println("main");
	    //}
		
	}
	public static class invalidNumberExcep extends Exception{
		public invalidNumberExcep(String m) {
			super(m);
		}
	}
	
	public static class emailexcept extends Exception{
		public emailexcept(String m) {
			super(m);
		}
	}
	
	

}
