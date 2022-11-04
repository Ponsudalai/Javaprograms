package com.overr;

class Employee{
	public void display() {
		System.out.println("Display method of employeee");
	}
}
class Hrempolyee extends Employee{
	public void display() {
		System.out.println("Dispaly method of hremployee");
		super.display();
	}
}
public class Mainoverriding {

	public static void main(String[] args) {
		Hrempolyee ps= new Hrempolyee();
		ps.display();

	}

}
