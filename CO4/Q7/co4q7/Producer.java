package co4q7;

import java.util.LinkedList;
class Producer implements Runnable{
LinkedList<Integer> list;
Producer(LinkedList<Integer> list){
 this.list = list;
}
public void run() {
	 for(int i = 1; i <=8; i++){
	   synchronized(list) {
	      while(list.size() >=2){
	      try {
	         list.wait();
	       } catch (InterruptedException e) {
	         e.printStackTrace();
	       }
	     }
	     System.out.println("producer produced   " + i);
	     list.add(i);
	     list.notify();    
	   }
	 }		
	}
}