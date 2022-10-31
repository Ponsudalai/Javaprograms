package sudalai;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int num;
		Scanner ps=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num=ps.nextInt();
		
		int k=num%2;
		switch(k) 
		{
		case 0:System.out.println(num+" THIS EVEN NUMBER");
		break;
		case 1:System.out.println(num+" THIS ODD NUMBER");
		break;
		
		}

	}

}
