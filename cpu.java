package pricecpu.java;
import java.util.Scanner;

public class cpu {
	int price;
	
	cpu(int p){
		this.price=p;
	}
	void display() {
		System.out.println("PRICE OF CPU : " + this.price);
	}

	 class Processor{
		 int no_cores;
		 String manufacturer;
		 Processor(int a,String b){
			 this.no_cores=a;
			 this.manufacturer=b;
			 
			 
		 }
		 void display() {
	            System.out.println("No of Cores : " + this.no_cores);
	            System.out.println("Processor manufactures : " + this.manufacturer);

		 }
	 }
static class RAM{
	int memory;
	String manufacturer;
	
	RAM(int r,String m){
		this.memory=r;
		this.manufacturer=m;
	}
	void display() {
        System.out.println("Memory Size : " + this.memory);
        System.out.println("Memory manufactures : " + this.manufacturer);

	}
}
	public static void main(String[] args) {
		cpu intel=new cpu(45000);
		cpu.Processor processor=intel.new Processor(45,"intel");
		cpu.RAM ram=new RAM(8,"HP");
		intel.display();
		processor.display();
		ram.display();
		
		
        
        
		
		

	}

}
