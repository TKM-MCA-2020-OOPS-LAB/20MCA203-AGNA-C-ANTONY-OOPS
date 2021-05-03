package work1.java;
import java.util.Scanner;


public class complexadd {
	double real;
	double imag;
	complexadd(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	public static complexadd sum (complexadd n1,complexadd n2) {
		complexadd temp=new complexadd(0,0);
		temp.real=n1.real+n2.real;
		temp.imag=n1.imag+n2.imag;
		return temp;
	}


	public static void main(String[] args) {
		complexadd n1=new complexadd(3,4);
		complexadd n2=new complexadd(4,8);
		complexadd temp=sum(n1,n2);
		System.out.println("Sum of numbers is :"+ temp.real+"+"+ temp.imag +"i");
		

	}

}
