package com.jsp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.project.Response.ResponseStructure;
import com.jsp.project.dao.BranchDao;
import com.jsp.project.dto.Branch;

@Service
public class BranchService {

	@Autowired
	private BranchDao branchdao;

	public ResponseEntity<ResponseStructure<Branch>> SaveBranch(Branch branch) {
		ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Branch Created");
		responseStructure.setPostNo(HttpStatus.CREATED.value());
		responseStructure.setData(branchdao.SaveBranch(branch));
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Branch>> FetchBranch() {
		ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Branch Fetched");
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setData(branchdao.FetchBranch());
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure, HttpStatus.OK);

	}

	public ResponseEntity<ResponseStructure<Branch>> FetchBranchById(int id) {

		ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Branch Fetched");
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setData(branchdao.FetchBranchById(id));
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Branch>> UpdateBranch(int id, Branch branch) {
		
		ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Branch Updated");
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setData(branchdao.UpdateBranch(id,branch));
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure, HttpStatus.OK);
		
	}

	public ResponseEntity<ResponseStructure<Branch>> UpdateEmail(int id, String email) {
		
		ResponseStructure<Branch> responseStructure = new ResponseStructure<>();
		responseStructure.setMessage("Email Updated ");
		responseStructure.setPostNo(HttpStatus.OK.value());
		responseStructure.setData(branchdao.UpdateEmail(id,email));
		return new ResponseEntity<ResponseStructure<Branch>>(responseStructure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Branch>> Deletebranch(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
