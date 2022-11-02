package com.spring;
import java.util.Scanner;

//import java.lang.module.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
       Configuration cfg=new  Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
      System.out.println("-----------------------------------for insertion or creation-------------------------------------");
       Session session=factory.openSession();
       session.beginTransaction();
       Employee e=new Employee();
       e.setEmpId(1);
       e.setAddress("delhi");
       e.setEmpName("tanuja");
       session.save(e);
       session.getTransaction().commit();
       session.close();
       //factory.close();
      
      Session session2=factory.openSession();
       session2.beginTransaction();
       Employee e1=new Employee();
       e1.setEmpId(2);
       e1.setAddress("banglore");
       e1.setEmpName("diya");
       session2.save(e1);
       session2.getTransaction().commit();
       session2.close();
      
       
     System.out.println("----------------for updation------------");
      Session session3=factory.openSession();
      session3.beginTransaction();
     
       System.out.println("enter id");
       int id=sc.nextInt();
       Employee upemp=session3.get(Employee.class,id);
       if(upemp!=null) {
    	   sc.nextLine();
    	   System.out.println("emter the name");
    	   String name=sc.nextLine();
    	   System.out.println("enter the address");
    	   String address=sc.nextLine();
    	   upemp.setEmpName(name);
    	   upemp.setAddress(address);
    	   session3.saveOrUpdate(upemp);
    	   session3.getTransaction().commit();
       }
       else {
    	   System.out.println("id not found");
    	   
       }
       session3.close();
     
       
       
      System.out.println("-----------for deletion--------------");
       Session session4=factory.openSession();
       session4.beginTransaction();
      
       System.out.println("enter id");
       int id1=sc.nextInt();
       Employee delemp=session4.get(Employee.class,id1);
       if(delemp!=null) {
    	   session4.delete(delemp);
    	   session4.getTransaction().commit();
       }
       else {
    	   System.out.println("id not found");
       }
       session4.close();
       factory.close();
    }
}