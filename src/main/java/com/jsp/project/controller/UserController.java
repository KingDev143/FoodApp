package com.jsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.project.Response.ResponseStructure;
import com.jsp.project.dto.User;
import com.jsp.project.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(path = "/save")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping(path = "/fetch")
	public ResponseEntity<ResponseStructure<User>> Getuser() {
		return userService.Getuser();
	}

	@GetMapping(path = "/fetchId/{id}")
	public ResponseEntity<ResponseStructure<User>> FindById(@PathVariable int id) {
		return userService.FindById(id);
	}

	@PutMapping(path = "/update/{id}")
	public ResponseEntity<ResponseStructure<User>> updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}

}
