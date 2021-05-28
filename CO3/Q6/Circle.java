package co3q6.java;
import java.util.*;

 class Circle implements Objects {
	 float r;
	 double pi=3.14;
	 double peri;
	 double ar;
	 Scanner sc=new Scanner(System.in);

	public void perimeter() {
		 System.out.println("Enter radius of circle : ");
		 r= sc.nextFloat();
		 peri = (2*pi*r);
	     System.out.println("Perimeter of the circle is : "+peri);
		
		
	}
	public void area() {
		 ar = (pi*r*r);
	     System.out.println("Area of circle is : "+ar);
		
		
	}
}
