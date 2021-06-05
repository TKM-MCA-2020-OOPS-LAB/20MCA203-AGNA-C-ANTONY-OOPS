package graphics;
import java.util.*;

 public class Square implements Shapes {
	 int a;
	 Scanner sc=new Scanner(System.in);
	 public void area() {
		 System.out.println("Enter length of a side of square : ");
		 a= sc.nextInt();
		 System.out.println("Area of the rectangle is : "+(a*a));
	 }
	 
	 

}
