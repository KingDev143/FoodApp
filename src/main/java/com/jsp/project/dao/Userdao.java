package com.jsp.project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.jsp.project.Exception.UserIdNotPresentException;
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

	public User FindById(int id) {

		Optional<User> findById = userRepo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		throw new UserIdNotPresentException("Invalid Id");
	}

	public User updateUser(int id, User user2) {

		Optional<User> findById = userRepo.findById(id);
		if (findById.isPresent()) {
			return userRepo.save(user2);
		}
		throw new UserIdNotPresentException("Invalid Id");
	}

	public User deleteUser(int id) {
		Optional<User> findById = userRepo.findById(id);
		if (findById.isPresent()) {
			userRepo.deleteById(id);
			return findById.get();
		}
		throw new UserIdNotPresentException("Invalid Id");
	}

}
