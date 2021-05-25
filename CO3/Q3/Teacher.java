package co3q3.java;

public class Teacher extends Employee {
	String Subject;
	String Department;
	String Teacherid;

	 Teacher(String Name,String Gender,String Age,String Address, String Empid,String Company_name,String Qualification,String Salary,String Subject,String Department) {
		super(Name,Gender,Age,Address,Empid,Company_name,Qualification,Salary);
		this.Subject=Subject;
		this.Department=Department;
		this.Teacherid=Teacherid;
	}
	 void displaydetails() {
		 System.out.println("Employee name :"+Name);
		 System.out.println("Employee Gender :"+Gender);
		 System.out.println("employee Age :"+Age);
		 System.out.println("Address  :"+Address);
		 System.out.println("Employee id:"+Empid);
		 System.out.println(" company name:"+Company_name);
		 System.out.println("Qualification :"+Qualification);
		 System.out.println("Employee Subject :"+Subject);
		 System.out.println("employee Department :"+Department);
		 System.out.println("Teacher ID:"+Teacherid);
		 
	 }

}
