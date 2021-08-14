package co4q12;
import java.util.*;

public class Stackremove {

	public static void main(String[] args) {

		Stack<String> sr = new Stack<String>();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number Of fruits: ");
		 int n=sc.nextInt();
		 System.out.println("Enter name of "+n+" fruits: ");
		 for(int i =0;i<n;i++)
		 {
			
			 String s=sc.next();
			 sr.add(s);

		 }
		 System.out.println();

		System.out.println("Initial Stack: " + sr);

		 System.out.println("Enter the position of fruite in stack to be removed: ");
		 int p=sc.nextInt();

		String re = sr.remove(p);

		System.out.println("\nRemoved element: "+ re);


		System.out.println("\nFinal Stack: " + sr);


	}

}
