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
			
		
	}
	 
}			
			
			



