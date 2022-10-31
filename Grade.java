package sudalai;

import java.util.Scanner;

class marks{
	
			int mark;
			
			void inputMark() {
				Scanner ps=new Scanner(System.in);
				System.out.println("Enter The Mark ");
				mark=ps.nextInt();
			}
			
			
			void dispalymarks() 
			{
				if(mark>=90 && mark<=100) {
					System.out.println("GRADE A");
				}
				
				else if(mark>=70 && mark<=89)
				{
					System.out.println("GRADE B");
				}
				else if(mark>=40 && mark<=69)
				{
					System.out.println("GRADE C");
				}
				else if(mark>=0 && mark<=39)
				{
					System.out.println("GRADE D");
				}
			}
		}

public class Grade
{
	public static void main(String[] args) 
	
	{
		
		marks np=new marks();
		np.inputMark();
		np.dispalymarks();
		}

	
}

