package com.edu;

class PersonAge extends Exception{
	
	

	private static final long serielversionUID=1L; 
	public PersonAge(String s) {
		super(s);
	}
}
class Vote{
	void checkAge(int a) {
		try {
			if (a<18)throw new PersonAge("Age Less Then Not Eligible For Vote ");
			
		}
		catch(PersonAge e) {
			e.printStackTrace();
		}
	}
}
public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vote nps=new Vote();
			nps.checkAge(13);
	}

}
