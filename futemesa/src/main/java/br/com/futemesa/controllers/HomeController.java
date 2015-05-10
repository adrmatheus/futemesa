package br.com.futemesa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String index() {
		System.out.println("Server is running!!!");
		return "hello-world.jsp";
	}

}
