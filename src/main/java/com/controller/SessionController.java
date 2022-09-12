package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;
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
	public String saveUser(@Valid UserBean user, BindingResult result, Model model) {

		if (result.hasErrors()) {

//			System.out.println(result.getAllErrors());
			System.out.println(result.getFieldErrors());// List

			for (FieldError error : result.getFieldErrors()) {
				System.out.println(error.getField() + " : " + error.getDefaultMessage());
				model.addAttribute(error.getField(),error.getDefaultMessage());
			
			}
			model.addAttribute("user",user);
			return "Signup";
		} else {

			System.out.println(user.getFirstName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());

			// Model
			model.addAttribute("user", user); // request.setAttribute("user",user);
			return "Home";// request.getRequestDispatcher("Login.jsp").forward(request,response);
		}
	}
	//

	@GetMapping("/inputnumber")
	public String inputNum() {
		return "InputNumbers";
	}

	@PostMapping("/calc")
	public String addition(CalcBean calc, Model model) {
		System.out.println(calc.getA());
		System.out.println(calc.getB());
		int ans = 0;

		switch (calc.getOperation()) {
		case "add":
			ans = calc.getA() + calc.getB();
			break;
		case "sub":
			ans = calc.getA() - calc.getB();
			break;
		default:
		case "mul":
			ans = calc.getA() * calc.getB();
			break;

		}

		model.addAttribute("ans", ans);
		return "Ans";
	}

}
