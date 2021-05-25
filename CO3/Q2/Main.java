package co3qstn.java;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of teachers  :");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			Teacher[] teacher =new Teacher[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter employee id  ");
			    String  Empid=sc.next();
			    System.out.println("Enter employee name  ");
			     String Name=sc.next();
			    System.out.println("Enter employee salary ");
			    String Salary=sc.next();
			    System.out.println("Enter employee address ");
			    String Address = sc.next();
			    System.out.println("Enter department name ");
			    String Department = sc.next();
			    System.out.println("Enter Subject taught ");
			    String sub_taken = sc.next();
			    
			    teacher[i]= new Teacher(Empid, Name, Salary, Address,Department,sub_taken);
			    }
			System.out.println("\n LIST OF TEACHERS \n");
			for(int i=0;i<n;i++) {
				teacher[i].displaydetails();
				System.out.println("\n ................\n");
				
			}
	
		}
	}

}
