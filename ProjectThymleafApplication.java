package com.amber;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class ProjectThymleafApplication {
	
	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(ProjectThymleafApplication.class, args);
		StdRepo repo=context.getBean(StdRepo.class);
		
		
		
		
//		 Student s=new Student( );
//		Laptop l=new Laptop( );
//		
//		s.setSname("Bheem");
//		s.setSaddress("Faridabad");
//		s.setLap(l);
//
//		l.setName("Laptop");
//		l.setBrand("Lenovo");
//		 l.setSd(s);
//		repo.save(s);
//		System.out.println(s);
		

//		 Student s1=new Student( );
//		Laptop l1=new Laptop( );
//		
//		s1.setSname("Raju");
//		s1.setSaddress("Hydrabad");
//		s1.setLap(l1);
//
//		l1.setName("Mouse");
//		l1.setBrand("HB");
//		 l1.setSd(s1);
//		repo.save(s1);
//		System.out.println(s1);
		
		
	  //update record 
//		Optional<Student> sd= repo.findById(1);
//		Student ss1=sd.get();
//		ss1.setSname("Jaggu");
//		ss1.setSaddress("Bhopal");
//        ss1.setLap(l);
//        l.setName("Mobile");
//        l.setBrand("Samsung");
//		repo.save(ss1);
	
		//to see all records
//		List<Student> sl=repo.findAll();
//		for(Student e1:sl) {
//			
//			System.out.println(e1);
//			
//		}
		//to delete  records
//		repo.deleteById(113);
//		System.out.println("Record deleted Successfullyy!!!");
		
//		//to delete all records
		//repo.deleteAll();
		
		
		
	}
	
	

		
	
		
	}


