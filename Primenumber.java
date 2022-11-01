package find;

import java.util.Scanner;

public class Primenumber {

public static void main(String[] args) {
int num,c=0;
Scanner sc=new Scanner(System.in);
while(true) {
System.out.println("Enter number");
num=sc.nextInt();
                      
for(int i=1;i<=num;i++) { 
if(num%i==0) { 
c=c+1;
}
}
if(c==2) {
System.out.println(num+" is prime");
}
else {
System.out.println(num+" is not prime");
}

System.out.println("Do you want to check any other number y/n");
char ch=sc.next().charAt(0);
if(ch=='n') {
break;
}
}
System.out.println("THANKYOU FOR USE");

}
}