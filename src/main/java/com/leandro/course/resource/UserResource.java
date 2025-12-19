package com.leandro.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.course.entities.User;

//CONTROLADOR REST QUE RESPONDE NO CAMINHO /users
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// Controlador rest que responde no caminho /users
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Leandro", "Leandro@gmail.com", "21 99999 9999", "123456"); // so para teste 
		return ResponseEntity.ok().body(u);
		
	}
}
