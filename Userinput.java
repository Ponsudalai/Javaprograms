package types;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		int age;
		float fees;
		String name;
		char gender;
		String location;
		String state;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name ");
		name=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("Enter fees");
		fees=sc.nextFloat();
		System.out.println("Enter gender M/F");
		gender=sc.next().charAt(0);
		System.out.println("Enter your location");
		location=sc.next();
		System.out.println("Enter your state");
		state=sc.next();
		
		
		//display
		
		System.out.println("NAME:"+ name );
		System.out.println("AGE:"+age);
		System.out.println("FEES:"+fees);
		System.out.println("GENDER:"+gender);
		System.out.println("LOCATION:"+location);
		System.out.println("STATE:"+state);
		
		
		
		
		
		
	

	}

}
