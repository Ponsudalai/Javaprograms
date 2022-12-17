package com.edu;

@FunctionalInterface
interface Addition{
	void add(int a,int b);
}
@FunctionalInterface
interface Multiplication{
	int product(int a,int b);
}
@FunctionalInterface
interface Subraction{
	int sub(int a,int b);
}
@FunctionalInterface
interface Divition{
	int div(int a,int b);
}



public class MainApp {

	public static void main(String[] args) {
		 Addition ps=(int a,int b)->{
			 int s=a+b;
			 System.out.println("Sum = "+s);
		 };
		 ps.add(8, 9);
		 
		 Multiplication vj=(a,b)->(a*b);
			 int ans;
			 ans =vj.product(3, 9);
			System.out.println("Product = "+ans); 
		 
			 Subraction psp=(a,b)->(a-b);
			 int an;
			 an=psp.sub(6,4);
			 System.out.println("Subraction = "+an);
			 
			 Divition npps=(a,b)->(a/b);
			 int c;
			 c=npps.div(10, 2);
			 System.out.println("Divition = "+c);
			 
	
		 
		 Runnable np=()->{
			 System.out.println("The Run Method Is Called");
		 };
		 Thread vjs=new Thread(np);
		 vjs.start();

	}

}
