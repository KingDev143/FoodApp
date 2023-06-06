package com.jsp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.project.Response.ResponseStructure;
import com.jsp.project.dao.Userdao;
import com.jsp.project.dto.User;

@Service
public class UserService {
	@Autowired
	private Userdao userdao;

	@Autowired
	private User user;

	public User Saveuser(User user) {
		return userdao.Saveuser(user);
	}

	public List<User> Getuser() {
		return userdao.Getuser();
	}

	public ResponseStructure<User> findById(int u_id) {

		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("User Finede");
		responseStructure.setData(userdao.findById(u_id));
		return responseStructure;

	}

	public ResponseStructure<User> updateUser(int u_id, User user) {

		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Update Done");
		responseStructure.setData(userdao.updateUser(u_id, user));
		return responseStructure;

	}

	public ResponseStructure<User> deleteUser(int u_id) {

		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Deleted ");
		responseStructure.setData(userdao.deleteUser(u_id));
		return responseStructure;

	}

	public ResponseStructure<User> fetchByEmail(String u_email, String u_password) {

		User user2 = userdao.findbyEmail(u_email);
		if(u_password.equals(user.getU_password()))
		{
			ResponseStructure<User> responseStructure = new ResponseStructure<>();
			responseStructure.setPostNo(HttpStatus.FOUND.value());
			responseStructure.setMessage("Fetching Done");
			responseStructure.setData(userdao.findbyEmail(u_email));
			return responseStructure;
		}
		else
		{
			ResponseStructure<User> responseStructure = new ResponseStructure<>();
			responseStructure.setPostNo(HttpStatus.NOT_FOUND.value());
			responseStructure.setMessage("USER NOT FOUND");
			return responseStructure;
		}

	}

}
