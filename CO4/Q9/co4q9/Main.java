package co4q9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Bubblesort  obj= new Bubblesort  ();
		System.out.println("Before sorting:");
		 obj.display(arr,n);
		
		 obj.sort(arr,n);
		 
		System.out.println("\nAfter Sorting:");
		 obj.display(arr,n);

	}

}
