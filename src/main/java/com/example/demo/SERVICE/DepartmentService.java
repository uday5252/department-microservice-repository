package com.example.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ENTITY.DepartmentEntity;
import com.example.demo.REPOSITORY.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public DepartmentEntity collectAndSaveDepartment(DepartmentEntity departmentData)
	{
		DepartmentEntity savedDepartmentData = departmentRepository.save(departmentData);
		return savedDepartmentData;
	}
	
	public List<DepartmentEntity> readAllTheDepartmentsData()
	{
   	    List<DepartmentEntity> fetchedDepartmentsData = departmentRepository.findAll();
   	    return fetchedDepartmentsData;
	}
	
	public DepartmentEntity realParticularDepartmentData(int id)
	{
		DepartmentEntity fetchedDepartmentData = departmentRepository.findById(id).get();
		return fetchedDepartmentData;
	}
	

	public String deleteParticularDepartmentData(int id)
	{
		departmentRepository.deleteById(id);
		return "Department data is deleted successfully!";
	}

	public DepartmentEntity updateParticularDepartmentData(int id, DepartmentEntity latestData)
	{
		DepartmentEntity fetchedOldDepartmentData = departmentRepository.findById(id).get();
		
		fetchedOldDepartmentData.setDepartmentName(latestData.getDepartmentName());
		fetchedOldDepartmentData.setDepartmentDescription(latestData.getDepartmentDescription());
		fetchedOldDepartmentData.setDepartmentFloorNo(latestData.getDepartmentFloorNo());
		fetchedOldDepartmentData.setDepartmentCode(latestData.getDepartmentCode());
		
		DepartmentEntity updatedData = departmentRepository.save(fetchedOldDepartmentData);
		return updatedData;
	}
}
