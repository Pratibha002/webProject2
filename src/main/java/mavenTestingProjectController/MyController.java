package mavenTestingProjectController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@RequestMapping("/DatabaseConnectivity")  
    public String display(@RequestParam("name") String userName, @RequestParam("age") int userAge,@RequestParam("city") String userCity)  
    {  
		System.out.println("StudentController object created...");
		System.out.println("*** :"+userName);
		System.out.println("*** :"+userAge);
		System.out.println("*** :"+userCity);
		JDBC_Connectivity obj=new JDBC_Connectivity();
		obj.createConnection(userName,userAge,userCity);
		
        return "Executed";  
    }  

}



