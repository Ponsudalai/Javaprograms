package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Information")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Student_ID")
	private int sid;
@Column(name="Student_Name")
	private String sname;
@Column(name="Student_Fees")
	private float sfees;
public Student() {
	super();
	
}
public Student( String sname, float sfees) {
	super();
	
	this.sname = sname;
	this.sfees = sfees;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public float getSfees() {
	return sfees;
}
public void setSfees(float sfees) {
	this.sfees = sfees;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
}


	
}
