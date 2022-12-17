package San;

import java.util.Scanner;

public class WeekEnd {

	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		System.out.println("------------------");
		
				int day=sc.nextInt();
				String dayType= switch(day) {
				case 1,2,3,4,5->"working day";
				case 6,7->"weekend";
				default->"invalid day";
				
				};
				System.out.println(dayType);
				System.out.println("Do You Want To Continue, Press n to Exit And Any key To Continue");
				char ps=sc.next().charAt(0);
				if(ps=='n') {
					break;
					

		}	
				
	}
		System.out.println("Thank for Visit");
	}}
