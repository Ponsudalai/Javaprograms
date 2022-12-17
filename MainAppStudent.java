package com.edu;

public class MainAppStudent {
	
	int a,b;
	
	public void setData(int c,int d){
		a=c;
		b=d;
		
	}
	public void showData() {
		System.out.println( "The A Values Is = "+a );
		System.out.println( "The B Values Is = "+b );
	}

	public static void main(String[] args) {
		
		MainAppStudent np=new MainAppStudent();
		MainAppStudent ps=new MainAppStudent();
	np.setData(1, 2);
	ps.setData(3, 4);
	np.showData();
	
	MainAppStudent s3;
	s3=ps;
	s3.showData();
	ps=null;
	ps.showData();
	s3.showData();
	

	}

}
