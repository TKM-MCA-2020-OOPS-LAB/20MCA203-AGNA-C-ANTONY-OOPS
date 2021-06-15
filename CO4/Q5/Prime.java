package co4q5;
import java.util.*;

public class Prime extends Thread {

	public void run() {
		int n,i=3,count,m;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter limit for prime numbers:");
	    n=sc.nextInt();
	    if(n >=1)
	    {
	    	System.out.println("First "   +n+   "   prime numbers are:");
	    	System.out.println("2");
	    	for(count = 2; count <= n; i++)
	    	{
	    		 for(m= 2; m < i;m++) {
	    			 if(i%m == 0)
		                    break;
	    		 }
	    		 if(m== i) 
	    		 {
	    			 System.out.println(i);
		                count++; 
	    		 }
	    	}
	    }
	    	
	    
		
	}

}
