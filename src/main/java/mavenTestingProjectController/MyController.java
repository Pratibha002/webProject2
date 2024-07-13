package mavenTestingProjectController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	//@ResponseBody
	@RequestMapping("/test")
	public String test() {
		
		return "working";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		
		return "Form";
	}
	
	@ResponseBody
	@RequestMapping("/DatabaseConnectivity")  
    public String display(@RequestParam("name") String userName,
    @RequestParam("age")String userAge,@RequestParam("city") String userCity,
    @RequestParam("emailId") String userEmail,
    @RequestParam("mobNum") String userMob)  
    {  
		if(userMob==""||userMob.length()>10||userMob.length()<10) {
			return "Invalid input!! Please provide a valid 10-digit mobile number.";
		}
	   else if(!checkValidName(userName)) { 
			return "Invalid input!! cant' left the field empty or can't enter numbers and special characters in name field only [A-Z/a-z] is allowed";
		}else if(!checkValidName(userCity)) {
			return "Invalid input!! cant' left the field empty or can't enter numbers and special characters in city field only [A-Z/a-z] is allowed";
		}else if(userEmail==null) {
			 return "Invalid input!! Email must be provided";
		}else if(userAge==""||userAge.length()<=0) {
			 return "Invalid input!! Enter valid age  ";
		}
		else {
			System.out.println("StudentController object created...");
			System.out.println("*** :"+userName);
			System.out.println("*** :"+userAge);
			System.out.println("*** :"+userCity);
			System.out.println("*** :"+userEmail);
			System.out.println("*** :"+userMob);
			JDBC_Connectivity obj=new JDBC_Connectivity();
			obj.createConnection(userName,userAge,userCity, userEmail, userMob);
			return "Executed";
		}	
    } boolean checkValidName(String name) {
        if (name.length() == 0 || name.length() > 30 ) {
            return false;
        }
        	for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
                }
            }
        return true;  
    }
    
    
}