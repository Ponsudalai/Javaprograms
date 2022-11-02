package edu.com;

class product{
	
	int pid;
	String pname;
	float pprice;
	int pmodel;
	product(){
		pid=7;
		pmodel=12345;
		pname="SAMSUNG TV";
		pprice=14500.99f;
		
	}
	 product(int i, String string, float f,int b) {
		pid=i;
		pmodel=b;
		pname=string;
		pprice=f;
		
	}
	void display() {
		
		System.out.println("The Product ID:"+pid);
		System.out.println("The Product Model:"+pmodel);
		System.out.println("The Product Name:"+pname);
		System.out.println("The Product Price:"+pprice);
		
	}
}

public class productMain {

	public static void main(String[] args) {
		product ps=new product();
		System.out.println("pid="+ps.pid);
		System.out.println("pmodel"+ps.pmodel);
		System.out.println("pname="+ps.pname);
		System.out.println("pprice="+ps.pprice);
		
		
		product ps1=new product(05,"LENOVO LAPTOP",15999.99f,12346);
		product ps2=new product(8,"LENOVO TABLET",14599.99f,12347);
		ps.display();
		ps1.display();
		ps2.display();
	}

}
