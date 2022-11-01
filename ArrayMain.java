package find;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner ps=new Scanner(System.in);
		System.out.println("ENTER THE 5 ELEMENTS: ");
		System.out.println("ARRAY SIZE="+arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=ps.nextInt();
		}
				System.out.println("THE ARRAY ELEMNTS ARE : ");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				int s=0;
				for(int i=0;i<arr.length;i++) {
					s=s+arr[i];
				}
				System.out.println("SUM ="+s);
				float avg=(float)s/arr.length;
				System.out.println("AVERAGE :"+avg);
				
				
				int max=arr[0];
				
				for(int i=1;i<arr.length;i++) {
					if(arr[i]>max) {
						max=arr[i];
						
					}
				}
				System.out.println("THE LARGEST NUMBER:"+max);
				
				int min=arr[0];
				for(int i=1;i<arr.length;i++) {
					if(arr[i]<min) {
						min=arr[i];
						
					}
				}
				System.out.println("THE SMALLEST NUMBER:"+min);
	}
	
	

}
