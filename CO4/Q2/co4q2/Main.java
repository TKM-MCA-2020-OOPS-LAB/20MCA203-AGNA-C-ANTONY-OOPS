package co4q2;
import arithematic.Addition;
import arithematic.Multiplication;
import arithematic.Division;
import arithematic.Substraction;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a ;
		float b;
		System.out.println("Enter the first number ");
		a=sc.nextFloat();
		System.out.println("Enter the  second number ");
		b=sc.nextFloat();
		Addition ad= new Addition();
		ad.function(a, b);
		Multiplication mul=new Multiplication();
		mul.function(a, b);
		Division di= new Division();
		di.function(a, b);
		Substraction su=new Substraction();
		su.function(a, b);
		
		
		
	}

}
