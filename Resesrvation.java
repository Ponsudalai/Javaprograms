package sudalai;

import java.util.Scanner;

class train{
	 String pname;
     String coach;
     long mobileno;
     int amt;
     int totalamt;
     
     
   
        
		void inputdata() {
        	 
              
              Scanner ps=new Scanner (System.in);
              System.out.println("Enter The Passenger Name");
              pname=ps.nextLine();
              System.out.println("Eneter The Coach Name");
              coach=ps.nextLine();
              System.out.println("Enter The Passenger Mobile No");
              mobileno=ps.nextLong();
              System.out.println("Enter The Amount");
              totalamt=ps.nextInt();
        	  
          }
     
          void update()
          
          {
        	  if
        	  (coach.equals("1st AC")) {
        		  totalamt=700+amt;
        	  }
        	  
        	  else if(coach.equals("2nd AC")) {
        		  totalamt=500+amt;
        	  }
        	  
        	  else if(coach.equals("3rd AC")) {
        		  totalamt=250+amt; 
        	  }
        	  
        	  else if(coach.equals("SL")) {
        		  totalamt=amt;
        	  }}
        	  
        	   void dispaly() {
             	  
        		   
        	          System.out.println("The Passenger name: "+pname);
        	      	  System.out.println("The passenger mobile no: "+mobileno);
        	      	  System.out.println("The passengr coach: "+coach);  
        	      	  System.out.println("The total amount: "+totalamt);
               	  
               }
}
      	  
public class Resesrvation {

	public static void main(String[] args) {
		
		train ns=new train();
		ns.inputdata();
		ns.update();
		ns.dispaly();
	
		

	}

}
