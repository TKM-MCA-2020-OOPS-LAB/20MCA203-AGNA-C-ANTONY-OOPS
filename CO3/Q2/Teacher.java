package co3qstn.java;

public class Teacher extends Empoyee {
	String Department;
	String sub_taken;

	Teacher(String Empid,String Name,String Salary,String Address,String Department,String sub_taken) {
		super( Empid, Name, Salary, Address);
		this.Department=Department;
		this.sub_taken=sub_taken;
		
	}
	void displaydetails() {
		 System.out.println("Employee id :"+Empid);
		 System.out.println("Employee name :"+Name);
		 System.out.println("Employee salary :"+Salary);
		 System.out.println("employee address :"+Address);
		 System.out.println("Department  :"+Department);
		 System.out.println("Subject taken:"+sub_taken);
	}

}
