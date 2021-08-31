package co4q16;
import java.util.*;
public class Comaprehashset {

	public static void main(String[] args) {
		Set<Integer> S1=new HashSet<Integer>();
		Set<Integer> S2=new HashSet<Integer>();
		
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in first set:");
		n1=sc.nextInt();
		System.out.println("Enter elements of first set:");
		for(int i=0;i<n1;i++)
		{
			int x=sc.nextInt();
			S1.add(x);
		}
		System.out.println("Enter number of elements in Second set:");
		n2=sc.nextInt();
		System.out.println("Enter elements of Second set:");
		for(int i=0;i<n2;i++)
		{
			int y=sc.nextInt();
			S2.add(y);
		}
		
		System.out.println("HashSet1: "+S1);
		System.out.println("HashSet2: "+S2);
		Set<Integer> union = new HashSet<Integer>(S1);
        union.addAll(S2);
        System.out.print("Union of  two Sets");
        System.out.println(union);
        
        Set<Integer> inter = new HashSet<Integer>(S1);
        inter.retainAll(S2);
        System.out.print("Intersection of the two Sets");
        System.out.println(inter);
        
        Set<Integer> diff = new HashSet<Integer>(S1);
        diff.removeAll(S2);
        System.out.print("Difference of set1 from set2");
        System.out.println(diff);	
		
	}

	

}
