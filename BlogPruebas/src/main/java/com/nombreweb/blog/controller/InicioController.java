package com.nombreweb.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	
	@GetMapping(value="/")
	public String bienvenida(Model model) {
		return "index";
	}

}
