package edu.com;

public class Blockmain {
	
	static {
		System.out.println("static block will execute before the main");
	}
	{
		System.out.println("Annoymous block will execute before contructor call");
	}
	Blockmain(){
		System.out.println();
	}
	{
		System.out.println("Constuctor block will execute on Object creation");
	}
	void display()
	{
		System.out.println("Lenovo");
	}
	public static void main(String[] args) {
				System.out.println("The Main Method");
				Blockmain ps=new Blockmain();
				ps.display();
	}

}
