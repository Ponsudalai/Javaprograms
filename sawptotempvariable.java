package types;

public class sawptotempvariable {

	public static void main(String[] args) {
		int a,b;
		a=40;
		b=60;
		System.out.println("before interchange a="+a+" and b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after interchange a="+a+" and b="+b);
	}

}
