package graphics;
import graphics.Shapes;

public class Main {

	public static void main(String[] args) {
		System.out.println("The areas of figures are;");
		System.out.println("Rectangle:");
		rectangle re=new rectangle();
		re.area();
    	System.out.println("Circle:");
    	Circle c=new Circle();
		c.area();
    	System.out.println("Square:");
    	Square s=new Square();
		s.area();
    	System.out.println("Triangle:");
    	Triangle t=new Triangle();
		t.area();
	}
      
		      
}
