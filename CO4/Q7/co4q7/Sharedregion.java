package co4q7;

import java.util.LinkedList;

public class Sharedregion {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Thread t1 = new Thread(new Producer(list), "Producer");
		 Thread t2 = new Thread(new Consumer(list), "Consumer");
		 t1.start();
		 t2.start(); 

	}

}
