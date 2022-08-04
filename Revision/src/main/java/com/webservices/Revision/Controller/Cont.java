package com.webservices.Revision.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Revision.Students;

@RestController
public class Cont {
	@GetMapping("/hello")
	String message() {
		return ("hello");
	}
	
	@GetMapping("/students_details")
	List<Students> getFlight() {
	
	Students s1 = new Students("Anand",1,"Varanasi","A");
	Students s2 = new Students("Ruchika",2,"Ghaziabad","B");
	Students s3 = new Students("Prakash",3,"Jharkhand","C");
	
	List<Students> l = new ArrayList<Students>() ;
	l.add(s1);
	l.add(s2);
	l.add(s3);
	
	return l;
	
	}
	
    
	
	
}
