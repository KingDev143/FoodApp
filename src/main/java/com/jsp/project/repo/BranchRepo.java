package com.jsp.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.project.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer>
{

}
