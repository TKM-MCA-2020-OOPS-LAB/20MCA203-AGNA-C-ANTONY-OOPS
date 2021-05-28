package co3q6.java;
import java.util.*;



public class Main {
	public static void main(String[] args) {
		System.out.println("Choices for objects are given below");
		System.out.println("1.Rectangle.");
		  System.out.println("2.Circle.");
		  System.out.println("Enter the choice:");
		  Scanner sc =new Scanner(System.in);
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		      case 1: 
		      Rectangle rect =new Rectangle();
		      rect.perimeter();
		      rect.area();
		      break;
		      case 2: 
		      Circle cir =new Circle();
		      cir.perimeter();
		      cir.area();
		      break;
		      default:
		      System.out.println("invalid choice");
		      break;      
		  }
		

	}

}
