package com.edu;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeHQL {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Employee_ID")
private int employeeid;
@Column(name="E_Name",length = 30,nullable = false)
private String empname;
@Column(name="E_Mail",length = 40,nullable = false)
private String mail;
private Date doj;
private Double salary;
public EmployeeHQL() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeHQL(int employeeid, String empname, String mail, Date doj, Double salary) {
	super();
	
	this.empname = empname;
	this.mail = mail;
	this.doj = doj;
	this.salary = salary;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeHQL [employeeid=" + employeeid + ", empname=" + empname + ", mail=" + mail + ", doj=" + doj
			+ ", salary=" + salary + "]";
}




}
