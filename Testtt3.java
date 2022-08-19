package labtest3;

class Encapsulation{
    private int Accountnumber;
    private String empName;
    private int empAge;
    private String empEmail;

    //Getter and Setter methods
    public int getEmpSSN(){
        return Accountnumber;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpacn(int newValue){
        Accountnumber = newValue;
    }
    public void setempEmail(String newValue){
        empEmail = newValue;
    }

	public String getempEmail() {
		// TODO Auto-generated method stub
		return empEmail;
	}
	

}
public class Testtt3{
    public static void main(String args[]){
         Encapsulation obj = new Encapsulation();
         obj.setEmpName("Ankit Shukla");
         obj.setEmpAge(22);
         obj.setEmpacn(37161583);
         obj.setempEmail("ankitshukla.online@gmail.com");
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Accountnumber: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
         System.out.println("Employee email: " + obj.getempEmail());
    } 
}
