package co3q3.java;

public class Employee extends person {
	 String Empid;
	 String Company_name;
	 String Qualification;
	 String Salary;

	public Employee(String Name,String Gender,String Age,String Address, String Empid,String Company_name,String Qualification,String Salary) {
		super(Name,Gender,Age,Address);
		this.Empid=Empid;
		this.Company_name=Company_name;
		this.Qualification=Qualification;
		this.Salary=Salary;
	}

}
