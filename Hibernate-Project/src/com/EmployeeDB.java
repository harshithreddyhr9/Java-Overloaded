package com;

import java.util.List;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployeeDB {
   private static SessionFactory factory; 
  
   public static void main(String[] args) {
         
     EmployeeDB obj= new EmployeeDB();
     // obj.addEmployee();
    
     //obj.displayEmployeeDetailsById();
     // obj.displayEmployeeDetails();
      obj.updateEmployee(454,"Rammy");
     //obj.removeEmployee(209);
      
      
   }
   
   
 // Adding new Employee Record
    public void addEmployee(){
	   Session session=null;
	   Integer employeeCount=null;
	   try{
	    
		  factory = new Configuration().configure().buildSessionFactory();
	      session = factory.openSession();
	      
	      //Employee employee = new Employee();
	      Employee1 employee = new Employee1();
	      employee.setEmpId(454);
	      employee.setEmpName("Ramesh");
         
	      Transaction tx = session.beginTransaction();
          employeeCount = (Integer) session.save(employee); 
          tx.commit();
          
	   }catch (Exception e) { 
	      System.err.println("Failed to create sessionFactory object." + e);
	      throw new ExceptionInInitializerError(e); 
	   }finally {
         session.close(); 
       }
       System.out.println("Employee Count--"+  employeeCount);
   }
    
    
    //Dispalying an Employee Record
    
    public void displayEmployeeDetailsById(){
    	Session session=null;
 	  
 	   try{
 	    
 		  factory = new Configuration().configure().buildSessionFactory();
 	      session = factory.openSession();
 	      
 	      Employee1 emp = (Employee1) session.get(Employee1.class,454); 
 	      if(emp==null){
 	    	  System.out.println("Employee Not Found");
 	      }else{
 	   	  System.out.println(emp.getEmpId() + "  "+ emp.getEmpName());
 	      }
 	             
 	   }catch (Exception e) { 
 	      System.err.println("Failed to create sessionFactory object." + e);
 	      throw new ExceptionInInitializerError(e); 
 	   }finally {
          session.close(); 
        }
   	
   }
    
    
    //Updating employee record
    
    public void updateEmployee(int empId,String name){
    	Session session=null;
 	  
 	   try{
 	    
 		  factory = new Configuration().configure().buildSessionFactory();
 	      session = factory.openSession();
 	      
 	      Employee1 emp = (Employee1) session.get(Employee1.class,empId); 
 	     if(emp==null){
	    	  System.out.println("Employee Not Found");
	      }else{
	    	  Transaction tx = session.beginTransaction();
	    	  emp.setEmpName(name);
	    	 // session.update(emp);
	    	  System.out.println(emp.getEmpId() + "  "+ emp.getEmpName());
	    	  tx.commit();
	      session.close();
	      }
 	   	  
 	             
 	   }catch (Exception e) { 
 	      System.err.println("Failed to create sessionFactory object." + e);
 	      throw new ExceptionInInitializerError(e); 
 	   }finally {
          session.close(); 
        }
   	
   }
    
    // Removing an employee record
    
    public void removeEmployee(int empId){
    	Session session=null;
 	  
 	   try{
 	    
 		  factory = new Configuration().configure().buildSessionFactory();
 	      session = factory.openSession();
 	      
 	      Employee emp = (Employee) session.get(Employee.class,empId); 
 	     if(emp==null){
	    	  System.out.println("Employee Not Found");
	      }else{
	    	  Transaction tx = session.beginTransaction();
	    	  session.delete(emp);
	    	  tx.commit();
	      }
 	   	  
 	             
 	   }catch (Exception e) { 
 	      System.err.println("Failed to create sessionFactory object." + e);
 	      throw new ExceptionInInitializerError(e); 
 	   }finally {
          session.close(); 
        }
   	
   }
    
       
    
   // Selecting all employee record   
    public void displayEmployeeDetails(){
    	Session session=null;
  	    try{
  	    
  		  factory = new Configuration().configure().buildSessionFactory();
  	      session = factory.openSession();
  	      
  	      List<Employee1> employeeList = session.createQuery("FROM Employee").list(); 
  	      for(Employee1 emp: employeeList){
  	    	  System.out.println(emp.getEmpId() + "  "+ emp.getEmpName());
  	      }
  	    
            
  	   }catch (Exception e) { 
  	      System.err.println("Failed to create sessionFactory object." + e);
  	      throw new ExceptionInInitializerError(e); 
  	   }finally {
           session.close(); 
         }
    	
    }
    
    
    
    
    
}