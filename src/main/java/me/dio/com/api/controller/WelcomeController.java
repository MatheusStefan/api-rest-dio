package me.dio.com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Olá";
	}
}
