package com.jsp.project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.project.dto.Branch;
import com.jsp.project.repo.BranchRepo;

@Repository
public class BranchDao {
	
	
	@Autowired
	private BranchRepo branchrepo;

	public Branch SaveBranch(Branch branch) 
	{
		
		return branchrepo.save(branch);
	}

	public List<Branch> FetchBranch() {
	
		return branchrepo.findAll();
	}

	public Branch FetchBranchById(int id) 
	{
		
		 Optional<Branch> findById = branchrepo.findById(id);
		 if(findById.isPresent())
		 {
			 return findById.get();
		 }
		 return null;
	}

	public Branch UpdateBranch(int id, Branch branch) {
		    Optional<Branch> findById = branchrepo.findById(id);
		    if(findById.isPresent())
		    {
		    	return branchrepo.save(branch);
		    }
		return null;
	}

	public Branch UpdateEmail(int id, String email) 
	{
		
		Optional<Branch> findById = branchrepo.findById(id);
		if(findById.isPresent())
		{
			Branch branch = findById.get();
			branch.setEmail(email);
			return branch;
		}
		return null;
	}

}
