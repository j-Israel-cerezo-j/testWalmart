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

import com.walmart.test.service.TestService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class TestController {

	@Autowired
	private TestService testService;
		
	@PostMapping("searchArray/")
    public ResponseEntity<Map<String,Integer>> searchArray(@Valid @RequestBody Map<String, String[]> arrays) {
		
		System.out.println("Hola mundo");
		String [] array1 = arrays.get("array1");
		String [] array2 = arrays.get("array2");
        return ResponseEntity.ok(testService.listResponse(array1, array2));
    }
	@GetMapping("getMundo/")
	public ResponseEntity<String> getMundo(){
		return ResponseEntity.ok("Hola mundo");
	}
}
