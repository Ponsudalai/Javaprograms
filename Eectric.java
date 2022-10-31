package sudalai;

public class Eectric {

	public static void main(String[] args) {
	
		int unit=455;
		double billtopay=0;
		
		if(unit<100)
		{
			billtopay=unit*1.20;
		}
		
		else if (unit<300)
		{
			billtopay=100*1.20+(unit-100)*2;
			
		}
		
		else if (unit>300)
		{
			billtopay=100*1.20+200*2+(unit-300)*3;
		}
					System.out.println("THE ELECTIC CITY BILL FOR "+unit+" IS : "+billtopay);
	}
							
}
