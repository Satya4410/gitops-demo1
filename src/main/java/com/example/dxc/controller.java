package com.example.dxc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {

	@GetMapping("/hello")
	public String Hello() {
		return "Welcome to the GitOps demo";
	}
}
