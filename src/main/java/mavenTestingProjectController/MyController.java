package mavenTestingProjectController;

import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("name", "pratibha");
		
		return "Data2";
	}
	
	@RequestMapping("/test4")
	public String test4() {
		
		return "login";
	}
	
	
	@ResponseBody
	@RequestMapping("/DatabaseConnectivity")  
    public String display(@RequestParam("name") String userName,
    @RequestParam("age")String userAge,@RequestParam("city") String userCity,
    @RequestParam("emailId") String userEmail,
    @RequestParam("mobNum") String userMob,
    @RequestParam("pswd") String userPswd)  
    {  
		if(userMob==""||userMob.length()>10||userMob.length()<10) {
			return "Invalid input!! Please provide a valid 10-digit mobile number :)";
		}
	   else if(!checkValidName(userName)) { 
		   return "Invalid input!! Cannot leave the name field empty or enter numbers/special characters in the name field. Only [A-Z/a-z] is allowed :)";
		}else if(!checkValidName(userCity)) {
			return "Invalid input!! Cannot leave the city field empty or enter numbers/special characters in the name field. Only [A-Z/a-z] is allowed :)";
		}else if(userEmail==null|| !checkValidEmail(userEmail)) {
			 return "Invalid input!! Email must be provided :)" ;
		}else if(userAge==""||Integer.parseInt(userAge) <= 0) {
			 return "Invalid input!! Enter valid age :) ";
		}else if(userPswd==""||userPswd.length()>10) {
			 return "Invalid input!! Password must be provided / oops! not more than 10 character :)";
		}	 
		else {
			System.out.println("StudentController object created...");
			System.out.println("*** :"+userName);
			System.out.println("*** :"+userAge);
			System.out.println("*** :"+userCity);
			System.out.println("*** :"+userEmail);
			System.out.println("*** :"+userMob);
			System.out.println("*** :"+userPswd);
			JDBC_Connectivity obj=new JDBC_Connectivity();
			obj.createConnection(userName,userAge,userCity, userEmail, userMob, userPswd);
			return "Executed";
		}	
    } boolean checkValidName(String name) {
        if (name.length() == 0 || name.length() > 50 ) {
            return false;
        }
        	for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
                }
            }
        return true;  
    }boolean checkValidEmail(String email){
    	String  e ="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    	Pattern pattern =Pattern.compile(e);
    	return pattern.matcher(email).matches();
    }
    
    


//@ResponseBody
@RequestMapping("/loginForm")
public String login(@RequestParam("name")String userName,
		@RequestParam("password")String userPswd, Model model ) throws Exception {
	
	
	Data_Retrieval d = new Data_Retrieval();
	
		Student_dto s = d.checkUser(userName, userPswd);
		
		System.out.println(userName);
		System.out.println(userPswd);
		if(s!=null) {
		model.addAttribute("s", s);//it send the data from mode/db to view.
		return "Data";
	}else {
		return "Invalid";
	}
	
 }
}	
	
	
//	@RequestMapping("/loginForm")
//	public String login(@RequestParam("name") String username,
//            @RequestParam("pswd") String password,
//            Model model) {
//	System.out.println(username);
//	System.out.println(password);
//
//        boolean isValidUser = Data_Retrieval.validateUser(username, password);
//	
//			isValidUser = Data_Retrieval.validateUser(username, password);
//
//        if (isValidUser) {
//        	
//			 Student_dto	userDetails = Data_Retrieval.getUserDetails(username);
//			
//           
//			model.addAttribute("userDetails", userDetails);
//            return "/Data";
//        } else {
//            return "/login";
//        }
//    }

