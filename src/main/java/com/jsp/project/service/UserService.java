package com.jsp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<ResponseStructure<User>> saveUser(User user2) {

		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.CREATED.value());
		responseStructure.setMessage("User Created");
		responseStructure.setData(userdao.Saveuser(user2));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<User>> Getuser() {
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Data Fetched Successfully");
		responseStructure.setData(userdao.Getuser());
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<User>> FindById(int id) {

		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Data Fetched Successfully");
		responseStructure.setData(userdao.FindById(id));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<User>> updateUser(int id, User user2) {
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Data Updated");
		responseStructure.setData(userdao.updateUser(id, user2));

		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<User>> deleteUser(int id) {
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setMessage("Data Deleted");
		responseStructure.setData(userdao.deleteUser(id));

		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.OK);
	}

}
