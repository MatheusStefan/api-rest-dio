package me.dio.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@GetMapping(value = "/{username}")
	public Usuario getUser(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.remove(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
