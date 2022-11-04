package com.edu;

class hardClass{
	int a,b;
	hardClass(int a,int b){
		this.a=a;
		this.b=b;
		}
}

class simple extends hardClass{
	int s;
		simple(int a, int b) {
		super(a, b);
		
	}
		void add() {
			s=a+b;
			System.out.println("The Sum= "+s);
		}
}
public class CpMain {

	public static void main(String[] args) {
	simple ps=new simple(80, 90);
	ps.add();
	}

}
