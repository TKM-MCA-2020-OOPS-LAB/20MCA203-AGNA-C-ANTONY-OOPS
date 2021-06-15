package co4q6;


public class Main {
	public static void main(String[] args) {
		Even series=new Even();
		Thread t1=new Thread(series);
		t1.start();
		Fibo  ra=new Fibo();
		Thread t2=new Thread(ra);
		t2.start();

	}

}
