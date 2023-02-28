package com.yusufcs.restTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusufcs.restTest.model.TestModel;
import com.yusufcs.restTest.repository.TestRepository;

@CrossOrigin(origins = "https://localhost:3001")
@RestController
@RequestMapping("/api/test")
public class TestCotroller {
	
	@Autowired
	private TestRepository testRepository;
	
	@GetMapping("/players")
	public List<TestModel> getPlayers(){
		return testRepository.findAll();
	} 
	
//	@PostMapping("/players")
//	public TestModel savePlayer(@RequestBody TestModel players) {
//		
//		return testRepository.save(players);
//	}

}
