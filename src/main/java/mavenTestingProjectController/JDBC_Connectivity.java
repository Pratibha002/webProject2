package mavenTestingProjectController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Connectivity {
	
	 static Connection con; 
	 public void createConnection(String name, int age, String city) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user ="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/learning";
			
			con=DriverManager.getConnection(url,password,user);
			
			String query ="insert into personalInfo(name, age, city) values(?,?,?)";
			
			PreparedStatement p = con.prepareStatement(query);
			
			p.setString(1,name);
			p.setInt(2, age);
			p.setString(3, city);
			
			p.executeUpdate();
			System.out.println("Successfully executed");	
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	 }

}
