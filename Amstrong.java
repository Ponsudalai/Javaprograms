package find;

import java.util.Scanner;

class number{
	int d,t,sum,num;
	
	void inputNum() {
		Scanner ps=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER");
		num=ps.nextInt();
		}
	void changereverse() {
		sum=0;
		t=num;
		while(num>0) {
			d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		if(t==sum) {
			System.out.println(t+" Is Amstrong Number");
		}
		else {
			System.out.println(t+" Is Not Amstrong Number");
		}
	}
}

public class Amstrong {

	public static void main(String[] args) {
		number ns=new number();
		ns.inputNum();
		ns.changereverse();
		

	}

}
