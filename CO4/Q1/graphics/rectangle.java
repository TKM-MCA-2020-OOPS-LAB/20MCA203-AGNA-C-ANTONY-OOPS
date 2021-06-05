package graphics;
import java.util.Scanner;

 class rectangle implements Shapes {
	 int l;
	 int b;
	 Scanner sc=new Scanner(System.in);
	 public void area() {
		 System.out.println("Enter length of rectangle : ");
		 l= sc.nextInt();
		 System.out.println("Enter breadth of rectangle : ");
	     b= sc.nextInt();
	     System.out.println("Area of the rectangle is : "+(l*b));
	 }
	 
	 

}
