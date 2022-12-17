package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentJPA {
	@Id
	private int studentid;
	private String studentname;
	private float studentfees;
	public StudentJPA() {
		super();
		
	}
	public StudentJPA(int studentid, String studentname, float studentfees) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentfees = studentfees;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public float getStudentfees() {
		return studentfees;
	}
	public void setStudentfees(float studentfees) {
		this.studentfees = studentfees;
	}
	@Override
	public String toString() {
		return "studentJPA [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}
	
	
	
	
	
	
}
