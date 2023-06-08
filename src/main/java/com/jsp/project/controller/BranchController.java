package com.jsp.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.project.Response.ResponseStructure;
import com.jsp.project.dto.Branch;
import com.jsp.project.service.BranchService;

@RestController
public class BranchController {
	@Autowired
	private BranchService branchservice;

	@PostMapping(path = "/Savebranch")
	public ResponseEntity<ResponseStructure<Branch>> SaveBranch(@RequestBody Branch branch) {
		return branchservice.SaveBranch(branch);
	}
	
	@GetMapping(path="/fetchbranch")
	public ResponseEntity<ResponseStructure<Branch>> FetchBranch()
	{
		return branchservice.FetchBranch();
	}
	
	@GetMapping(path="/fethById")
	public ResponseEntity<ResponseStructure<Branch>> FetchBranchById(@RequestParam int id)
	{
		return branchservice.FetchBranchById(id);
	}
	
	@PutMapping(path="/updateBranch/{id}")
	public ResponseEntity<ResponseStructure<Branch>> UpdateBranch(@PathVariable int id, @RequestBody Branch branch)
	{
		return branchservice.UpdateBranch(id,branch);
	}
	
	@PatchMapping(path="/updateEmail/{id}")
	public ResponseEntity<ResponseStructure<Branch>> UpdateEmail(@PathVariable int id,@RequestParam String Email )
	{
		return branchservice.UpdateEmail(id,Email);
	}
	
	@DeleteMapping(path="/deleteBranch/{id}")
	public ResponseEntity<ResponseStructure<Branch>> Deletebranch(@PathVariable int id)
	{
		return branchservice.Deletebranch(id);
	}
}
