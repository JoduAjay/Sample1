package com.example.SprinbootApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SprinbootApp.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {
	

}
