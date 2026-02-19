package com.aditya.helloapp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HelloController {

	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Hello"+ name;
	}

}
