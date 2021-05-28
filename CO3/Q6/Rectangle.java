package co3q6.java;

import java.util.Scanner;

class Rectangle implements Objects {
	 int l;
	 int b;
	 int peri;
	 int ar;
	 Scanner sc=new Scanner(System.in);
	 public void perimeter() {
		 System.out.println("Enter length of rectangle : ");
		 l= sc.nextInt();
		 System.out.println("Enter breadth of rectangle : ");
	     b= sc.nextInt();
	     peri = (2*(l+b));
	     System.out.println("Perimeter of the rectangle is : "+peri);
		
		
	}
	public void area() {
		ar = (l*b);
	     System.out.println("Area of the rectangle is : "+ar);
		
		
	}


}
