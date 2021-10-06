package com.zipcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zipcode.details.Zipcode;
import com.zipcode.repository.zip;

@RestController
public class ZipcodeController {
    @Autowired
    private zip zp;
	
	
	 @PostMapping("/add")
	 public Zipcode saveZipcode(@RequestBody Zipcode zip) {
	    	zp.save(zip);
	    	System.out.println("add");
//	    	return "Successfully added";
	    	return zip;
	    }
	 @GetMapping("/ziplist")
	 public List<Zipcode> geteverything(){
	    	List<Zipcode> lst = zp.findAll();
	    	return lst;
	    }
	
	 @PostMapping("/main/{zipId}")
		public Zipcode checkzpcode(@PathVariable Integer zipId) {
		Zipcode zip2= zp.findById(zipId).get();
		return zip2;
	 }
}
