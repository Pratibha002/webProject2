package mavenTestingProjectController;

public class Student_dto {

	public String name;
	public String age;
	public String city;
	public String emailId;
	public String mobNum;
	public String password;
	
	
	public String getPswd() {
		return password;
	}
	public void setPswd(String pswd) {
		this.password = pswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	@Override
	public String toString() {
		return "Student_dto [name=" + name + ", age=" + age + ", city=" + city + ", emailId=" + emailId + ", mobNum="
				+ mobNum + ", pswd=" + password + "]";
	}
	
}
