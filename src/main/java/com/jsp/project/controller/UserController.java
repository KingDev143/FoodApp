package com.jsp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.project.Response.ResponseStructure;
import com.jsp.project.dto.User;
import com.jsp.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(path = "/Save")
	public User saveUser(@RequestBody User user) {
		return userService.Saveuser(user);
	}

	@GetMapping(path = "/fetch")
	public List<User> Getuser() {
		return userService.Getuser();
	}

	@GetMapping(path = "/singlefetch")
	public ResponseStructure<User> findById(@RequestParam int u_id) {
		return userService.findById(u_id);
	}

	@PutMapping(path = "/update")
	public ResponseStructure<User> updateUser(@RequestParam int u_id, @RequestBody User user) {
		return userService.updateUser(u_id, user);
	}

	@DeleteMapping(path = "/delete")
	public ResponseStructure<User> deleteUser(@RequestParam int u_id) {
		return userService.deleteUser(u_id);
	}
	
	@GetMapping(path="/email")
	public ResponseStructure<User> fetchByEmail(@RequestParam String u_email,@RequestParam String u_password )
	{
		return userService.fetchByEmail(u_email,u_password);
	}
}
