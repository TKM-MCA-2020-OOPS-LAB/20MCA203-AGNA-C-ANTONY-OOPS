package co4q6;
import java.util.*;

public  class Fibo implements Runnable {

	public void run() {
		int c=0,n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("\nEnter a number to generate fibonacci series upto nth term");
		   n=sc.nextInt();
		   int a=0;
		   int b=1;
		   System.out.println("Fibonacci series upto "+n+" is :-");
		   while(c<=n)
		   {
		       System.out.print(c+" ");
		       a=b;
		       b=c;
		       c=a+b;
		   }
		   
		
		
	}

}
