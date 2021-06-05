package graphics;
import java.util.*;


 class Triangle implements Shapes {
	int h;
    int br;

    Scanner sc = new Scanner(System.in);

    public void area() {

        System.out.println("Enter height of the triangle : ");
        h = sc.nextInt();
        System.out.println("Enter breadth of triangle : ");
        br = sc.nextInt();
        String area = Double.toString((h*br)/2);
        System.out.println("Area of the triangle is : "+area);
    }

}
