package com.example.collegemgmt.models;

public class Department {
	private int department_id;
	private String department_name;
	private String student_id;
	private String staff_id;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String department_name, String student_id, String staff_id) {
		super();
		this.department_name = department_name;
		this.student_id = student_id;
		this.staff_id = staff_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	
	
}
