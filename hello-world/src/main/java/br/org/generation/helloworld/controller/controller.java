package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class controller {
	
	@GetMapping
	public String hello() {
		return "Hello World <br/> Teste";
		
	}

	

}
