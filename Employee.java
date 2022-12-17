package com.edu;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;






@Entity
@Table(name="Employee_D")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_ID")
	private int employeeid;
	@Column(name="Employee_Name")
	private String employeename;
	@Column(name="Employee_Phone")
	private long employeephone;
	
	@ManyToOne
	@JoinColumn(name="Department_Id")
	Department department;
	
	public Employee() {
		super();
		
	}
	public Employee(int employeeid, String employeename, long employeephone) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeephone = employeephone;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public long getEmployeephone() {
		return employeephone;
	}
	public void setEmployeephone(long employeephone) {
		this.employeephone = employeephone;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeephone="
				+ employeephone + ", department=" + department + "]";
	}
	
	

	
	
}
