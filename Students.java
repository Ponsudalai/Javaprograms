package com.edu;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries(  
		{	
		@NamedQuery(
				
				name="findStudentName",
				query="from Students where studentname=:n"
				)
		}
		)

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int studentid;
	
	private String studentname;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int studentid, String studentname) {
		super();
		
		this.studentname = studentname;
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
	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	
	
	

}
