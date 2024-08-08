package com.example.demo.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class DepartmentEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	private int departmentFloorNo;
	private String departmentDescription;
	private String departmentCode;
	
	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentEntity(int departmentId, String departmentName, int departmentFloorNo,
			String departmentDescription, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentFloorNo = departmentFloorNo;
		this.departmentDescription = departmentDescription;
		this.departmentCode = departmentCode;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentFloorNo() {
		return departmentFloorNo;
	}
	public void setDepartmentFloorNo(int departmentFloorNo) {
		this.departmentFloorNo = departmentFloorNo;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	
	
}
