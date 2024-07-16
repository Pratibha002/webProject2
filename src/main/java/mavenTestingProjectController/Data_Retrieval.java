package mavenTestingProjectController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Data_Retrieval {
	 
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user ="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/learning";
		
		Connection con=DriverManager.getConnection(url,password,user);
		
		String query ="select * from  personalInfo";
		
		PreparedStatement p = con.prepareStatement(query);
		ResultSet rs =p.executeQuery();
		while(rs.next()) {
			String userName =rs.getString("name");
			System.out.println("NAME : "+userName);
			
			String userAge =rs.getString("age");
			System.out.println("AGE : "+userAge);
			
			String userCity =rs.getString("city");
			System.out.println("CITY : "+userCity);
			
			String userEmail =rs.getString("emailId");
			System.out.println("EMAIL ID : "+userEmail);
			
			String userMob =rs.getString("mobNum");
			System.out.println("MOBILE NUMBER : "+userMob);
			
			String userPassword =rs.getString("password");
			System.out.println("PASSWORD : "+userPassword);
			
			System.out.println("==================================================================== ");
		}
		con.close();
	} public Student_dto checkUser(String name, String pswd) throws Exception {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    String user = "root";
	    String password = "root";
	    String url = "jdbc:mysql://localhost:3306/learning";

	        Connection con = DriverManager.getConnection(url, user, password); 
	        String query = "select * from personalInfo where name = ? and password = ?";
	        PreparedStatement p = con.prepareStatement(query);
	        p.setString(1, name);
	        p.setString(2, pswd);
	        ResultSet r = p.executeQuery();
	        
	       
	        Student_dto s = new Student_dto(); //db
	        

	        if (r.next()) {
	            s.setName(r.getString("name"));
	            s.setAge(r.getString("age"));
	            s.setCity(r.getString("city"));
	            s.setEmailId(r.getString("emailId"));
	            s.setMobNum(r.getString("mobNum"));
	            s.setPassword(r.getString("password"));
	            System.out.println(s);
	        }
	        return s;
	}
	 
}
	
//	public static boolean validateUser(String username, String password) {
//        try {
//        	
//            String query = "SELECT * FROM personalInfo WHERE name = ? AND password = ?";
//            PreparedStatement p = con.prepareStatement(query);
//            p.setString(1, username);
//            p.setString(2, password);
//
//            ResultSet rs = p.executeQuery();
//            
//            System.out.println(username);
//        	System.out.println(password);
//        	System.out.println("Successfully executed");
//            return rs.next(); // true if user exists with given username/password
//            
//           
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }public static Student_dto getUserDetails(String username) {
//    	
//          
//          
//        Student_dto userDetails = new Student_dto();
//        try {
//            String query = "SELECT * FROM personalInfo WHERE name = ?";
//            PreparedStatement p = con.prepareStatement(query);
//            p.setString(1, username);
//            ResultSet rs = p.executeQuery();
//            if (rs.next()) {
//                userDetails.setName(rs.getString("name"));
//                userDetails.setAge(rs.getString("age"));
//                userDetails.setCity(rs.getString("city"));
//                userDetails.setEmailId(rs.getString("emailId"));
//                userDetails.setMobNum(rs.getString("mobNum"));
//                userDetails.setPassword(rs.getString("password"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return userDetails;
//    }

	 
			
			
			



