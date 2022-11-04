package com.edu;

class Student{
        private int sid;
        private String sname;
        public Student() {
        	System.out.println("Constructor Make Access Specifier public because");
        	System.out.println("We Need To Create An Object");
        }

        public void display() {
        	System.out.println("Student ID: "+sid);
        	System.out.println("Student Name: "+sname);
        }
}

public class AccesssSpecifiersmain {

	public static void main(String[] args) {
		Student ps=new Student();
		ps.display();

	}

}
