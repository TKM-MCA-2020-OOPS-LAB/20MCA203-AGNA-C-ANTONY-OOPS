package graphics;
import java.util.*;

 public class Circle implements Shapes{
	 float r;
	 double pi=3.14;
	 double ar;
	 Scanner sc=new Scanner(System.in);
	  public void area() {
		 System.out.println("Enter radius of circle : ");
		 r= sc.nextFloat();
		 ar = (pi*r*r);
	     System.out.println("Area of circle is : "+ar);
	 }


}
