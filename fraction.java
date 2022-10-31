package find;

import java.util.Scanner;

public class fraction {

	public static void main(String[] args) {
		int num,i;
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the number");
		num=ps.nextInt();
		int f=1;
		while(num>=1)
		{
			f=f*num;
			num=num-1;
			
		}
	System.out.println("fraction"+f);

	}

}
