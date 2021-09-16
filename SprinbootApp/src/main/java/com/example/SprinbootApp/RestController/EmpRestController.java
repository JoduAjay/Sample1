package com.example.SprinbootApp.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SprinbootApp.Emp;
import com.example.SprinbootApp.Service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpRestController {
	 @Autowired
	    EmpService service;
	 
	    @GetMapping
	    public ResponseEntity<List<Emp>> getAllEmployees() {
	        List<Emp> list = service.getAllEmployees();
	 
	        return new ResponseEntity<List<Emp>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	    
	    @GetMapping("/{id}")
	    public Emp getempid(Emp id){
	    	Emp e = service.getAllEmp(id);
			return id ;
// return new ResponseEntity<Emp>(entity, new HttpHeaders(), HttpStatus.OK);
			
	    	
	    }
	 
	   /* @GetMapping("/{id}")
	    public ResponseEntity<Emp> getEmployeeById(@PathVariable("id") Emp id) 
	                                                     {
	    	//throws RecordNotFoundException
    	
	        Emp entity = service.getAllEmp(id);
	 
	        return new ResponseEntity<Emp>(entity, new HttpHeaders(), HttpStatus.OK);
	    }*/

}
