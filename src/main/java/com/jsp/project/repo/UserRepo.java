package com.jsp.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.project.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findAllu_email(String u_email);

}
