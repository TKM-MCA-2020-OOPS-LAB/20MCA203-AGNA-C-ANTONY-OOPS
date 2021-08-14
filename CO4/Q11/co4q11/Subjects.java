package co4q11;
import java.util.*;
import java.util.LinkedList;

public class Subjects {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		n=sc.nextInt();
		System.out.println("Enter name of "+n+" subjects: ");
		for(i=0;i<n;i++)
		{
			String subject=sc.next();
			list.add(subject);
		}
		for(i=0;i<n;i++)
		{	
			System.out.println("removed "+list.get(0)+" from list");
			list.remove(0);	
		}
		System.out.println("\nLinked list after removal: "+list);
	}

}
