package com.edu;

public class Execpt2 {

	public static void main(String[] args) {
			int a=10,b=0,c=0;
			System.out.println("After Divtion");
			try {
				if(b==0)throw new ArithmeticException("Divide By Zero");
				
					
			}
catch(ArithmeticException e){
	e.printStackTrace();
}
	}

}
