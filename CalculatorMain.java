package sudalai;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
	
		int ps;
		float n1,n2,ans;
		Scanner np=new Scanner(System.in);
		System.out.println("************MENU************");
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBRACTOIN");
		System.out.println("3. MULTIPLE");
		System.out.println("4. DIVISTION");
		ps=np.nextInt();
		System.out.println("ENTER 2 NUMBER");
		n1=np.nextFloat();
		n2=np.nextFloat();
		
		switch(ps)
		{
		case 1:ans=n1+n2;
		System.out.println("THE SUM OF "+n1+" AND "+n2+" IS "+ans);
		break;
		case 2:ans=n1-n2;
		System.out.println("THE DIFFERENCE OF "+n1+" AND "+n2+" IS "+ans);
		break;
		case 3:ans=n1*n2;
		System.out.println("THE PRODUCT OF "+n1+" AND "+n2+" IS "+ans);
		break;
		case 4:
			if(n2!=0)
			{
				ans=n1/n2;
				System.out.println("THE QUOTIENT OF "+n1+" AND "+n2+" IS "+ans);
			}
			else
			{
				System.out.println("DIVIDE BY ZERO ERROR");
			}
		break;
		default:System.out.println("ERROR");
		}
			

	}

}
