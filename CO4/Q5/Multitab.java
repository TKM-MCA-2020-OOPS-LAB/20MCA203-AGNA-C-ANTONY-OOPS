package co4q5;


public class Multitab extends Thread {
	
	public void run() {
	System.out.println("Print multiplication table of 5");
		for(int i =1;i<= 10;i++) {
			System.out.println(5+" * "+i+" = "+5*i);
		}
	
	}
}
