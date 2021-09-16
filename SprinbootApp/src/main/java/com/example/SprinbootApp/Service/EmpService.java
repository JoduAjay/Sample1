
package com.example.SprinbootApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SprinbootApp.Emp;
import com.example.SprinbootApp.Repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo Repository;
	
	  
    public List<Emp> getAllEmployees()
    {
        List<Emp> employeeList = Repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Emp>();
        }
    }


	public Emp getAllEmp(Emp Empid) {
		// TODO Auto-generated method stub
		return Empid;
	}
    
    
    
}
