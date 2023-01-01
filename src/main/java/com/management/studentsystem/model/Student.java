package com.management.studentsystem.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contactNumber;
	private String address;
	private String department;
	private List<String> selectedInCompany;
	private String companyJoined;
	/**
	 * 
	 */
	public Student() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<String> getSelectedInCompany() {
		return selectedInCompany;
	}
	public void setSelectedInCompany(List<String> selectedInCompany) {
		this.selectedInCompany = selectedInCompany;
	}
	public String getCompanyJoined() {
		return companyJoined;
	}
	public void setCompanyJoined(String companyJoined) {
		this.companyJoined = companyJoined;
	}
	
	
	
	
	

}
