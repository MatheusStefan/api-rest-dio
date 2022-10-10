package me.dio.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.dio.com.api.model.Usuario;
import me.dio.com.api.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/users")
@Api(value = "API REST Usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	@ApiOperation(value = "Retorna lista de usuários")
	public List<Usuario> getUsers() {
		return repository.listAll(); 
	}
	
	@GetMapping("/{username}")
	@ApiOperation(value = "Retorna um único usuário")
	public Usuario getUser(@PathVariable(value = "username") String username) {
		return repository.findByUsername(username);
	}
	
	@PostMapping("/user")
	@ApiOperation(value = "Salva um usuário")
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta um usuário")
	public void deleteById(@PathVariable("id") Integer id) {
		repository.remove(id);
	}
}
