package areaof.java;
import java.util.Scanner;
public class Area {
	int area1,area2;
	double area3,area4;
	
	void Area(int l,int b) {
		area1=l*b;
		System.out.println("The area of rectangle is "+area1);
	}
	 void  Area(int a) {
		area2=a*a;
		System.out.println("The area of rectangle is "+area2);
		
	}
	void  Area(float d,float h)
	{
		area3=0.5*d*h;
		System.out.println("The  area of triangle: "+area3);
	}
	void Area (float r)
	{
		area4=3.14*r*r;
		System.out.println("The area of triangle: "+area4);
	}

	public static void main(String[] args) {
		Area obj =new Area();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		int l=in.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		int b=in.nextInt();
		obj.Area(l, b);
		System.out.print("Enter the side of square : ");
		int a=in.nextInt();
		obj.Area(a);
		System.out.print("Enter the breadth of triangle : ");
		float d =in.nextFloat();
		System.out.print("\n ");
		System.out.print(" Enter the height of triangle : ");
		float h=in.nextFloat();
		obj.Area(d,h);
        System.out.print("Enter the radius of circle : ");
		float r=in.nextFloat();
		obj.Area(r);

		

		
		



		

	}


	

	}

