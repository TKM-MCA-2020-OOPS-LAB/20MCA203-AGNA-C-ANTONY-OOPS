package CO3Q4.java;
import java.util.Scanner;

public class Fiction extends book {
	String btype;
    String bdiscription;
    String bauother;
    Scanner sc=new Scanner(System.in);

	void get () {
		
		System.out.println("Enter the type");
		String btype=sc.next();
	    System.out.println("Enter the discription");
	    String bdiscription=sc.next();
	    System.out.println("Enter auother");
	    String bauthor=sc.next();
		
	}
	 void display() {
		 System.out.println("\nDetails\n");
		   System.out.println("Publisher of book:"+pub_name);
		   System.out.println("The book id:"+bookid);
		   System.out.println("Book name:"+book_name);
		   System.out.println("category:"+btype);
		   System.out.println("Author:"+bauother);


		   
	}

}
