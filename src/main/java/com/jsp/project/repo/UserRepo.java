package com.jsp.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.project.dto.User;

public interface UserRepo  extends JpaRepository<User, Integer>
{

    @Query("select s from User s where s.u_email=?1")
	 public User findbyEmail(String u_email);

	

	

}
