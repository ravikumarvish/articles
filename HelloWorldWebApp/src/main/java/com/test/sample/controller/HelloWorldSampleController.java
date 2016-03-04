package com.test.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSampleController {
	
	@RequestMapping(value="/name",method=RequestMethod.GET)
	public ResponseEntity<String> getName() {
		return new ResponseEntity<String>("RaviKumar",HttpStatus.OK);
	}

}
