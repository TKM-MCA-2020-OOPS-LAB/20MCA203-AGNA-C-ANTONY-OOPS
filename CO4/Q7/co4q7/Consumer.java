package co4q7;

import java.util.LinkedList;

public class Consumer implements Runnable {
	LinkedList<Integer> list;
	Consumer(LinkedList<Integer>list){
		this.list=list;
	}
	public void run() {
		for(int i = 1; i <=8; i++) {
			synchronized(list) {
				while(list.size()<1) {
					System.out.println(" list is empty..");
					try {
						list.wait();
					}catch(InterruptedException e) {
						 e.printStackTrace();
					}
				}
				System.out.println(" Consumer consumed- "  + list.remove());
			     list.notify();  
			}
			
		}
	}

	

}
