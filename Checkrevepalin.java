package find;

import java.util.Scanner;

class repeat {
	int num,rev,t;
	
	void inputNum() {
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		num=ps.nextInt();
		t=num;
	}
	void revNumber(){
		
		int d;
		int rev=0;
		while(num>0) {
			d=num%10;
			rev=rev*10+d;
			num=num/10;
			
		}
		System.out.println("Reverse number is ="+rev);
	}
	void numpallindrome() {
		if(t==rev) {
			System.out.println(t+" is pallindrome");
		}
		else {
			System.out.println(t+" is not pallindrome");
		}
	}
	
}

public class Checkrevepalin {

	public static void main(String[] args) {
		repeat ns=new repeat();
		ns.inputNum();
		ns.revNumber();
		ns.numpallindrome();
	}

}
