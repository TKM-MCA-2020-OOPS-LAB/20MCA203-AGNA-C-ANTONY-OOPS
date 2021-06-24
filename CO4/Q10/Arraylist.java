package co4q10;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> n=new ArrayList<String>();
		n.add("Blessy");
	    n.add("Ajo");
		n.add("Lilly");
		n.add("Nidhi");
	    n.add("Sree");
	    System.out.println("Original ArrayList:");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("arraylist:");
	    System.out.println(n);
	    System.out.println("Element added ArrayList:");
	    n.add(2,"Venu");
	    System.out.println(n);
	    System.out.println("Set new element ArrayList:");
	    n.set(1,"Swathi");
	    System.out.println(n);
	    System.out.println("element removed from ArrayList:");
	    n.remove("Lilly");
	    System.out.println(n);
	    System.out.println("Sorted ArrayList:");
	    Collections.sort(n);
	    System.out.println(n);
	    System.out.println("Size of the ArrayList:"+n.size());
	    n.clear();
	    System.out.println("ArrayList after clear method:"+n);
	    
			      

	}

}
