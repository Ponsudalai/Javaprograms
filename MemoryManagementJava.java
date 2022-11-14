package com.edu;

public class MemoryManagementJava {
	
	 int i;
	 String s;

	MemoryManagementJava(){
		
		 i=17;
		 s="SPARROW";
	 }

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		MemoryManagementJava np=new MemoryManagementJava();
		System.out.println("np="+np);
	    System.out.println(np.i);
	    System.out.println(np.s);
	    System.out.println(np.getClass());
	    System.out.println(np.hashCode());
	    np=null;
	    System.gc();
	    System.out.println("np="+np);
	    
		
	}
	@Override
	public void finalize() {
		System.out.println("Finalize Method Is Called When Object Becomes Null");
	}
}
