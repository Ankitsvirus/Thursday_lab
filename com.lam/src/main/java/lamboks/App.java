package lamboks;
import lamboks.Student;
public class App 
{
    public static void main( String[] args )
    {
        Student s=new Student();
        s.setId(1);
        s.setName("Ani");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
