package types;

public class Emp {
	
	int b;
	static int c=10; 
	
	void dispaly() {
		int k;
		System.out.println("b="+b);
		System.out.println("static data c="+c);
	}

	public static void main(String[] args) {
		
		
		int a=17;
		Emp op=new Emp();
		System.out.println("b="+op.b);
		System.out.println("static data c="+Emp.c);
		System.out.println("static data c="+op.c);
		System.out.println("static data c="+op.c);
		System.out.println("static data c="+c);
	}

}
