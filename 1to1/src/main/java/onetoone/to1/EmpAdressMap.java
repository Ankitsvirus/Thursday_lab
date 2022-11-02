package onetoone.to1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpAdressMap {

	public static void main(String[] args) {
		
   Configuration cfg=new Configuration().configure("hibernate.cfg.xml"); 
   SessionFactory factory=cfg.buildSessionFactory();
   Session session=factory.openSession();
   session.beginTransaction();
   Employee e1=new Employee();
  // e1.setEmployeeId(1);
   e1.setName("vishal");
   e1.setEmail("vishal@gmail.com");
   
   Address a1=new Address();
   a1.setAddressLine("No.121 vinayaknagar");
   a1.setCity("banglore");
   a1.setState("karnataka");
   a1.setCountry("india");
   a1.setPincode(561203);
   e1.setAddress(a1);
   a1.setEmployee(e1);
   
   session.save(e1);
   session.save(a1);
   session.getTransaction().commit();
   session.close();
   factory.close();
   

	}

}
