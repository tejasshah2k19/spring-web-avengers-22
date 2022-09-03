package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	// service

	// method -> open -> jsp

	@GetMapping("/signup")
	public String openSignup() {
		System.out.println("signup........");
		return "Signup";// jsp
	}

	@GetMapping("/login")
	public String openLogin() {
		return "Login";// jsp
	}

	@PostMapping("/saveuser") // data
	public String saveUser(UserBean user, Model model) {
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		// Model
		model.addAttribute("user", user); // request.setAttribute("user",user);
		return "Home";// request.getRequestDispatcher("Login.jsp").forward(request,response);
	}
	//
}
