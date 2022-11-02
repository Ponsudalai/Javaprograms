package edu.com;

class overloadfunction {
	void dislay() {
		System.out.println("No Argument Function");
	}
	void display(int i) {
		System.out.println("One Argument Function Of Type INT");
	}
	void display(float i) {
		System.out.println("One Argument Funtion Of Type FLOAT");
	}
	void display(double i) {
		System.out.println("One Argument Funtion Of Type DOUBLE");
	}
	void display(int i,int j){
		System.out.println("Two Argument Function Of Type INT");
	}
	void display(float i,float j){
		System.out.println("Two Argument Function Of Type FLOAT");
	}
	void display(double i,double j){
		System.out.println("Two Argument Function Of Type DOUBLE");
	}
	void display(int i,float j) {
		System.out.println("Two Argument Function Of Type int");
	}
	void display(float i,int j) {
		System.out.println("Two Argument Function Of Type float");
	}
}


public class Overload {

	public static void main(String[] args) {
		overloadfunction ps=new overloadfunction();
		ps.dislay();
		ps.display(45);
		ps.display(89.3f);
		ps.display(324.5);
		ps.display(34, 53);
		ps.display(47.6f, 55.8f);
		ps.display(345.9, 123.8);
		ps.display(53,32.1f );
		ps.display(45.8f, 23);
		
	}

}
