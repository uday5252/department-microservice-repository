package com.example.demo.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ENTITY.DepartmentEntity;
import com.example.demo.SERVICE.DepartmentService;

@RestController
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department/create")
	public ResponseEntity<DepartmentEntity> createDepartment(@RequestBody DepartmentEntity departmentData)
	{
		DepartmentEntity recievedDepartmentData = departmentService.collectAndSaveDepartment(departmentData);
		return new ResponseEntity<DepartmentEntity>(recievedDepartmentData, HttpStatus.CREATED);
	}
	
	@GetMapping("/department/read")
	public ResponseEntity<List<DepartmentEntity>> readAllDepartment()
	{
		List<DepartmentEntity> recievedAllDepartmentsData = departmentService.readAllTheDepartmentsData();
		return new ResponseEntity<List<DepartmentEntity>>(recievedAllDepartmentsData, HttpStatus.OK);
	}
	
	@GetMapping("/department/read/{departmentId}")
	public ResponseEntity<DepartmentEntity> readParticularDepartment(@PathVariable int departmentId)
	{
		DepartmentEntity recievedParticularDepartmentData = departmentService.realParticularDepartmentData(departmentId);
		return new ResponseEntity<DepartmentEntity>(recievedParticularDepartmentData, HttpStatus.OK);
	}
	
	@DeleteMapping("/department/delete/{departmentId}")
	public ResponseEntity<String> deleteParticularData(@PathVariable int departmentId)
	{
		String deleteConfirmationMessage = departmentService.deleteParticularDepartmentData(departmentId);
		return new ResponseEntity<String>(deleteConfirmationMessage, HttpStatus.OK);
	}
	
	@PutMapping("/department/update/{departmentId}")
	public ResponseEntity<DepartmentEntity> updateParticularData(@PathVariable int departmentId, @RequestBody DepartmentEntity latestDepartmentData)
	{
	  DepartmentEntity recievedDepartmentUpdatedData = departmentService.updateParticularDepartmentData(departmentId, latestDepartmentData);
	  return new ResponseEntity<DepartmentEntity>(recievedDepartmentUpdatedData, HttpStatus.OK);
	}
}



