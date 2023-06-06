package com.jsp.project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.jsp.project.dto.User;
import com.jsp.project.repo.UserRepo;

@Repository
public class Userdao {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private User user;

	public User Saveuser(User user) {
		return userRepo.save(user);
	}

	public List<User> Getuser() {
		return userRepo.findAll();
	}

	public User findById(int u_id) {

		Optional<User> optional = userRepo.findById(u_id);

		return optional.get();
	}

	public User updateUser(int u_id, User user) {
		Optional<User> optional = userRepo.findById(u_id);
		if (optional.isPresent()) {
			user.setU_id(u_id);
			return userRepo.save(user);
		}
		return null;
	}

	public User deleteUser(int u_id) {
		Optional<User> optional = userRepo.findById(u_id);
		if (optional.isPresent()) {
			userRepo.deleteById(u_id);
			return optional.get();
		}
		return null;
	}

	public User findbyEmail(String u_email) {
		
		
			User user = userRepo.findbyEmail(u_email);
			if(user!=null)
			{
			return user;
			}
			return null;
	

	}

}
