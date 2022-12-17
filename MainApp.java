package com.edu;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("-------------Database Operations--------------");
			System.out.println("1.Display Records");
			System.out.println("2.Insert Records");
			System.out.println("3.Update Record");
			System.out.println("4.Delete Record");
			
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:System.out.println("*Display Record*");
			         DataBaseAllOperations.displayRecord();
			         break;
			case 2: System.out.println("*Insert Record*");
			         DataBaseAllOperations.insertRecord();
			        break;
			case 3:System.out.println("*update Records*");
			        DataBaseAllOperations.updateRecord();
	        break;
	         case 4: System.out.println("*Delete Record*");
	                  DataBaseAllOperations.deleteRecord();
	         break;
	         default :System.out.println("Invalid Input");
			  
			} 
			
			System.out.println("Do you want to continue , press n to exit and any key to continue");
			char choice=sc.next().charAt(0);
			if(choice=='n') { 
				break;
			}
			
			}
			
			System.out.println("Thank For Visit :)");


}
}