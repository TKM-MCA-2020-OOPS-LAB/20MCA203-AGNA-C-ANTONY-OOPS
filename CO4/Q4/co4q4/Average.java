package co4q4;
import java.util.Scanner;




public class Average {

	
		public static void main(String[] args) {
			int n,sum=0;
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Enter how many numbers to be calculated:");
			  n=sc.nextInt();
			  int num[] =new int [n];
			  System.out.print("Enter numbers:");
			
			 for (int i = 0; i < n; i++) 
				{
					
						try {
							
							num[i] = sc.nextInt();
			               if(num[i]<0) { 
			                	throw new NegativeException("please enter a positive number");
			                }
			               else {
			            	   sum+=num[i];
			               }
			                
						}
			                
						catch (NegativeException e) {
							System.out.println("Exception occured"+e);

						}
							
						}
						
				System.out.println("Average: "+ sum / n);
		
						}
}

