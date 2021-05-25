package CO3Q4.java;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		System.out.println("Enter choice:");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		   case 1: System.out.println(" Enter licterature books details");
	       Literature lit =new Literature();
	       lit.get();
	       lit.display();
	       break;
		   case 2: System.out.println(" Enter fiction books details");
	       Fiction fic =new Fiction();
	       fic.get();
	       fic.display();
	       break;
		   default:
			   System.out.println("invalid choice");
		       break;
	       
		}
		
	

	}

}
