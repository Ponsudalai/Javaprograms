package com.edu;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_ID")
	private int employeeid;
	@Column(name="Employee_Name")
	private String employeename;
	@Column(name="E_Mail",length = 50,unique = false)
	private String employeeemail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressid")
	Address Address;
	
	public Employee() {
		super();
		
	}
	public Employee( String employeename, String employeeemail) {
		super();
		
		this.employeename = employeename;
		this.employeeemail = employeeemail;
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
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	
	
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		this.Address = address;
	}
	@Override
	public String toString() {
		return "Empolyee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeemail="
				+ employeeemail + "]";
	}
	
	

}
