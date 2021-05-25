package CO3Q4.java;
import java.util.Scanner;

public class Literature extends book {
	 String ltype;
	 String discription;
	 String auother;
	 Scanner sc = new Scanner(System.in);

	 void get () {
		
        System.out.println("Enter the type");
        String ltype=sc.next();
         System.out.println("Enter the discription");
         String discription=sc.next();
	    System.out.println("Enter auother");
	    String author=sc.next();
	    
		
		
	}
	  void display() {
		System.out.println("\nDetails\n");
		   System.out.println("Publisher of book:"+pub_name);
		   System.out.println("The book id:"+bookid);
		   System.out.println("Book name:"+book_name);
		   System.out.println("category:"+ltype);
		   System.out.println("About book:"+discription);
		   System.out.println("Author:"+auother);
	}
}


