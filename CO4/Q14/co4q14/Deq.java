package co4q14;
import java.util.*;

public class Deq {
	public static void main(String[] args) {
		 Deque<String> deqe = new ArrayDeque<String>();

		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number Of elements ");
			int n=sc.nextInt();
			System.out.println("Enter Elements ");
			for(int i =0;i<n;i++)
			{
				String s=sc.next();
				deqe.add(s);
		 
			}
			System.out.println("\nInitial Queue after addition: " + deqe);
			System.out.println("\nAfter removing all elements");
			
			
			for(int i =0;i<n;i++)
			{
				
				deqe.pop();
		 
			}
			System.out.println("\nFinal Queue is: " + deqe);
		

	}

}
