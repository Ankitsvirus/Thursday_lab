package labtest3;

public class Testt3 {
	
	    // Instance Variables
	    String name;
	    String course;
	    int age;
	   
	    // Constructor Declaration of Class
	    public Testt3 (String name, String course,int age)
	    {
	        this.name = name;
	        this.course = course;
	        this.age = age;
	    }
	   
	    // method 1
	    public String getName()
	    {
	        return name;
	    }
	    //method 2
	    public String getCourse()
	    {
	    return course;
	    }
	   
	  
	    public static void main(String[] args)
	    {
	        // creating object using new operator
	        Testt3 s1 = new Testt3("Ankit"," computer application",23);
	        
	        System.out.println(s1.getName());
	        System.out.println(s1.getCourse());
	    }
	}

