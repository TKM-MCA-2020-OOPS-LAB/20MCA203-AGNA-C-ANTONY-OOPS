package input.java;
import java.util.Scanner;

public class employee {
	int eNO;
	String eNAME;
	int eSalary;
	
	public void Getdata() {
		Scanner in = new Scanner(System.in);

	     System.out.print("Enter Employee id:"); 
	     eNO=in.nextInt();

	     System.out.print("Enter name of Employee:"); 
		 eNAME=in.next();

		 System.out.print("Enter salary of Employee:"); 
		 eSalary=in.nextInt();
		 System.out.println("\n"); 



    }
	void display() {
		System.out.println("Employee id =  " + eNO);
		  System.out.println("Employee name = " + eNAME);
		  System.out.println("Employee salary = " + eSalary);
		  System.out.println("\n"); 
	}

	public static void main(String[] args) {
		int n;
		 Scanner sc= new Scanner(System.in);

		 System.out.print("Enter No of employees :"); 
	     n=sc.nextInt(); 
		employee e[]= new employee[n];

		for( int i=0;i<n;i++) {
			e[i]= new employee();
			e[i].Getdata();

		}
		System.out.println("Details of Employees");
		for(int i =0;i<n;i++) {
		e[i].display();
		}


		 System.out.print("Enter the Employee ID to search :");
			int id = sc.nextInt();
			int i;
			for(i =0;i<n;i++)
			{
				if(id == e[i].eNO)
				{
					e[i].display();
				}
				else {
					System.out.println("\nEmployee Details are not available, Please enter a valid ID");
					System.exit(0);
				}
			}
			sc.close();
		
			



	}

}
