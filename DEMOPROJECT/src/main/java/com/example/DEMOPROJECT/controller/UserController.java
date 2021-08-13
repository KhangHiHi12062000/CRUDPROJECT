package com.example.DEMOPROJECT.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.DEMOPROJECT.models.Users;
import com.example.DEMOPROJECT.repository.UserRepository;
import com.example.DEMOPROJECT.services.UserServices;

@Controller
public class UserController {
	@Autowired
	UserServices userServices;
	
	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		Users user = new Users();
		model.addAttribute("USER" , user);
		model.addAttribute("ACTION", "saveOrUpdate");
		return "register-user";
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") Users user) {
		int abcd = 0; 
		userServices.save(user);
		
		return "register-user";
	}
	@RequestMapping("/list")
	public String list(ModelMap model) {
		
		
		model.addAttribute("USERS", userServices.findAll());
		return "view-user";
	}
	@RequestMapping("/edit/{username}")
	public String Edit(ModelMap model, @PathVariable("username") String username) {	
		Optional<Users> u = userServices.findById(username);
		if(u.isPresent()) {
			model.addAttribute("USER", u.get());
		}else
		{
			model.addAttribute("USER", new Users());
		}
		model.addAttribute("ACTION", "saveOrUpdate");
		return "register-user";
	}
	@RequestMapping("/delete/{username}")
	public String delete(ModelMap model,@PathVariable("username") String username) {
		userServices.deleteById(username);
		model.addAttribute("USERS", userServices.findAll());
		return "view-user";
	}
}
