package com.example.collegemgmt.models;

public class Staff {
	private int staff_id;
	private String staff_name;
	private String staff_subject;
	private String staff_department;
	private String staff_designation;
	private String staff_email;
	private String staff_contactno;
	private String staff_salary;
	private String staff_experience;
	private String staff_doj;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String staff_name, String staff_subject, String staff_department, String staff_designation,
			String staff_email, String staff_contactno, String staff_salary, String staff_experience,
			String staff_doj) {
		super();
		this.staff_name = staff_name;
		this.staff_subject = staff_subject;
		this.staff_department = staff_department;
		this.staff_designation = staff_designation;
		this.staff_email = staff_email;
		this.staff_contactno = staff_contactno;
		this.staff_salary = staff_salary;
		this.staff_experience = staff_experience;
		this.staff_doj = staff_doj;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getStaff_subject() {
		return staff_subject;
	}

	public void setStaff_subject(String staff_subject) {
		this.staff_subject = staff_subject;
	}

	public String getStaff_department() {
		return staff_department;
	}

	public void setStaff_department(String staff_department) {
		this.staff_department = staff_department;
	}

	public String getStaff_designation() {
		return staff_designation;
	}

	public void setStaff_designation(String staff_designation) {
		this.staff_designation = staff_designation;
	}

	public String getStaff_email() {
		return staff_email;
	}

	public void setStaff_email(String staff_email) {
		this.staff_email = staff_email;
	}

	public String getStaff_contactno() {
		return staff_contactno;
	}

	public void setStaff_contactno(String staff_contactno) {
		this.staff_contactno = staff_contactno;
	}

	public String getStaff_salary() {
		return staff_salary;
	}

	public void setStaff_salary(String staff_salary) {
		this.staff_salary = staff_salary;
	}

	public String getStaff_experience() {
		return staff_experience;
	}

	public void setStaff_experience(String staff_experience) {
		this.staff_experience = staff_experience;
	}

	public String getStaff_doj() {
		return staff_doj;
	}

	public void setStaff_doj(String staff_doj) {
		this.staff_doj = staff_doj;
	}
	
	
}
