package co3q3.java;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of teachers  :");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			Teacher[] teacher =new Teacher[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter  Name ");
			    String  Name=sc.next();
			    System.out.println("Enter Gender ");
			     String Gender=sc.next();
			    System.out.println("Enter Age ");
			    String Age=sc.next();
			    System.out.println("Enter Address ");
			    String Address = sc.next();
			    System.out.println("Enter employee Id ");
			    String Empid = sc.next();
			    System.out.println("Enter Company name ");
			    String Company_name = sc.next();
			    System.out.println("Enter Qualification ");
			    String Qualification = sc.next();
			    System.out.println("Enter  Subject ");
			    String  Subject=sc.next();
			    System.out.println("Enter Department ");
			     String Department=sc.next();
			    System.out.println("Enter Teacher Id ");
			    String Teacherid=sc.next();
			    
			    teacher[i]= new Teacher(Name,Gender,Age,Address,Empid,Company_name,Qualification,Subject,Department,Teacherid);
		

	}
			System.out.println("\n LIST OF TEACHERS \n");
			for(int i=0;i<n;i++) {
				teacher[i].displaydetails();
				System.out.println("\n ................\n");
				
			}

}
}
}