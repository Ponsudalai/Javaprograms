package com.edu;

public class Human {
	
	private Heart heart1,heart2;
	
	public Human( Heart heart2) {
		this.heart1=heart2;
	}
	public void heartfunction() {
		if(heart1!=null) {
			//System.out.println("humanHear"+heart1);
			System.out.println("Human is Alive");
			heart1.Laptop();
		}else {
			System.out.println("Heart is Not function");
			System.out.println("Human is Dead");
		}
	
	}

}
