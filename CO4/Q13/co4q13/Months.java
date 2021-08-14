package co4q13;
import java.util.*;
public class Months {

	public static void main(String[] args) {
		PriorityQueue<String> mn=new PriorityQueue<String>();  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of months ");
		int n=sc.nextInt();
		System.out.println("Enter the months ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			mn.add(st);
	 
		}
		System.out.println("head:"+mn.element());  
		System.out.println("head:"+mn.peek());  
		System.out.println("Iterating the queue elements\n ");  
		Iterator itr=mn.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		mn.remove();  
		mn.poll();  
		System.out.println("After changing elements the queue becomes:\n");  
		Iterator<String> itr2=mn.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  


}
