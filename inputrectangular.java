
package types;

import java.util.Scanner;

public class inputrectangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width,height;  //declaration
	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Width Value");
        width=sc.nextInt();
        System.out.println("Enter The Hight Value");
        height=sc.nextInt();
        
        
        //Display's The values
        
        System.out.println("The Width Value");
        System.out.println("The Height Value");
        System.out.println("The Area Of Traiangle "+width*height);
	}

}
