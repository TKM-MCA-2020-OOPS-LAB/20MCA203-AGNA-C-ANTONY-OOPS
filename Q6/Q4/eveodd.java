package co6q4;
import java.io.*;

public class eveodd {

	public static void main(String[] args) throws IOException {
		     FileInputStream fr = new FileInputStream("test.txt");
		     FileOutputStream fw1 = new FileOutputStream("even.txt");
		     FileOutputStream fw2 = new FileOutputStream("odd.txt");
		     System.out.println(" Seperate files for odd and even numbers are created successfully"); 
		     int n;
		     while((n=fr.read()) != -1) 
		    	  
		     {
		      if(n%2==0)
		      fw1.write(n);
		      else
		      fw2.write(n);
		     }
		     
		     fr.close();
		     fw1.close();
		     fw2.close();
		     
		 }
		
		

	

}
