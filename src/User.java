import java.util.ArrayList;
import java.util.Date;


public class User {
    private String name,lastName,email,password,jobTitle;
    private int age;
    private IAddress adresses;
    private ArrayList<IAddress> addressList = new ArrayList<IAddress>();
    private Date lastLogin = null; // will be updated when user login
    private Insurance insurance;
    private ArrayList<Insurance> insuranceList=new ArrayList<>();

    public User(){}

    //constructor
    public User(String name,String lastName,String email,String password,String jobTitle,int age,IAddress address){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.jobTitle = jobTitle;
        this.age = age;
        this.addressList.add(adresses);
        this.lastLogin = new Date(System.currentTimeMillis());
        this.insurance = insurance;
    }

    // Getters , Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
     }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public IAddress getAdresses() {
        return adresses;
    }

    public void setAdresses(IAddress adresses) {
        this.adresses = adresses;
    }

    public ArrayList<IAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<IAddress> addressList) {
        this.addressList = addressList;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
}
