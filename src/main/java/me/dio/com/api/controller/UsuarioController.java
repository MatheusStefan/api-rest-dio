package me.dio.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.com.api.model.Usuario;
import me.dio.com.api.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public List<Usuario> getUsers() {
		return repository.listAll(); 
	}
}
