package com.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userlogin.entity.User;
import com.userlogin.repository.UserRepository;
@Controller
public class UserController {
	@Autowired
	private UserRepository ur;

	@GetMapping("/signup")
	public String getSighUp() {
		return "signup.html";
	}
	@PostMapping("/login")
	public String getLogin(@ModelAttribute("user") User user) {
		System.out.println(user.getUsername() + " "+ user.getPassword());
		ur.save(user);
		return "login.html";
		
	}   @PostMapping("/main")
		public String checkuser(@ModelAttribute("user1") User user1) {
		User u1= ur.findById(user1.getUsername()).get();
		if(u1.getPassword().equals(user1.getPassword()) && u1.getUsername().equals(user1.getUsername()))
			return "ValidUser.html";
		return "InValidUser.html";
		
	}
	
}
