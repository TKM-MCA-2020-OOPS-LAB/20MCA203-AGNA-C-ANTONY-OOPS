package co4q6;

import java.util.Scanner;

public class Even implements Runnable {

	public void run() {
		int n ;
		Scanner sc= new Scanner(System.in);
		System.out.print("\nEnter the limit for even numbers");
		n=sc.nextInt();
		System.out.print("Even Numbers in the  given range are: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
		
				 System.out.print(i + " ");
			 }
		}
		
		
	}

}
