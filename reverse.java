package find;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		int sum;
		Scanner ps=new Scanner (System.in);
		System.out.println("ENTER THE VALUE");
		sum=ps.nextInt();
		
		int d;
		d=sum%10;
		System.out.print(d);
		sum=sum/10;
		d=sum%10;
		System.out.print(d);
		sum=sum/10;
		d=sum%10;
		System.out.print(d);
		sum=sum/10;
	}

}
