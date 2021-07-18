package com.tcs.aws.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDemoTestController {

	@RequestMapping(value = "name", method = RequestMethod.GET)
	public String getName() {

		return "Welcome to AWS Lokesh Reddy name!!";
	}

	@GetMapping("/name1")
	public String getName1() {

		return "Welcome to AWS Lokesh Reddy name1";
	}

}
