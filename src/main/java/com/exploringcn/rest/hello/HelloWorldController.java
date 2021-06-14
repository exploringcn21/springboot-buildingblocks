package com.exploringcn.rest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path = "/helloworld1")
	public String helloWorld1() {
		return "Hare Krishna!";
	}
	
	@GetMapping(path = "/helloworld2")
	public String helloworld2() {
		return "Jay Radha Madhav!";
	}
	
	@GetMapping(path = "/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Tonmoy", "Chowdhury", "Kolkata");
	}
}
