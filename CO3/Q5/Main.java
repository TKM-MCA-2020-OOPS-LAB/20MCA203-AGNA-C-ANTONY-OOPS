package co3q5.java;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student Academics details ");
		System.out.println("Enter marks in english  ");
	    int english=sc.nextInt();
	    System.out.println("Enter marks in hindi  ");
	    int hindi=sc.nextInt();
	    System.out.println("Enter marks in physics ");
	    int physics=sc.nextInt();
	    System.out.println("Enter marks in chemistry ");
	    int chemistry = sc.nextInt();
	    System.out.println("Enter marks in maths ");
	    int maths = sc.nextInt();
	    System.out.println("Enter runs scored ");
	    int runs = sc.nextInt();
	    System.out.println("Enter catches ");
	    int catches = sc.nextInt();
	    System.out.println("Enter wickets ");
	    int wicket = sc.nextInt();
	    result re=new result(english,hindi,physics,chemistry,maths,runs,catches,wicket);
	    re.display();
	    



		

	}

}
