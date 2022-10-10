package me.dio.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import me.dio.com.api.model.Usuario;
import me.dio.com.api.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping(value = "/users")
	public List<Usuario> getUsers() {
		return repository.listAll(); 
	}
	
	@GetMapping(value = "/user/{username}")
	public Usuario getUser(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
}
