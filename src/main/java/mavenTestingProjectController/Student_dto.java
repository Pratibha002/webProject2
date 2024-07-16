package mavenTestingProjectController;

public class Student_dto {

    private String name;
    private String age;
    private String city;
    private String emailId;
    private String mobNum;
    private String password; 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Other getter and setter methods for the remaining properties
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
                + mobNum + ", password=" + password + "]";
    }
}
