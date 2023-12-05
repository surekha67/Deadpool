package com.example.deadpool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/go")

public class Avengers {
	@GetMapping(path="/girl")
	public String check() {
		return "Hello Surekha !";
	}

}
