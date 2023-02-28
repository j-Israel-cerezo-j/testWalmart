package com.walmart.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.test.model.Test;
import com.walmart.test.service.TestService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class TestController {

	@Autowired
	private TestService testService;
		
	@PostMapping("searchArray/")
    public ResponseEntity<Map<String,Integer>> searchArray(@Valid @RequestBody Test test) {
		
		System.out.println(test);	
		
        return ResponseEntity.ok(testService.listResponse(test.getArrary1(), test.getArrary2()));
    }
	@GetMapping("getMundo/")
	public ResponseEntity<String> getMundo(){
		return ResponseEntity.ok("Hola mundo");
	}
}
