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
	    System.out.println(" After addition of an element ArrayList:");
	    n.add(2,"Venu");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Set new element ArrayList:");
	    n.set(1,"Swathi");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("element removed from ArrayList:");
	    n.remove("Lilly");
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Sorted ArrayList:");
	    Collections.sort(n);
	    for(String str:n)
	    	System.out.println(str);
	    System.out.println("Size of the ArrayList:"+n.size());
	    System.out.println("Sreee is present in List:"+n.contains("Sree"));
	    n.clear();
	    System.out.println("ArrayList after clear method:"+n);
	    
			      

	}

}
