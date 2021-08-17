package co4q15;
import java.util.*;
public class linkedhash {

	public static void main(String[] args) {
		LinkedHashSet <Integer> lh = new LinkedHashSet<>();
        lh.add(15);
        lh.add(28);
        lh.add(32);
        lh.add(49);
        lh.add(54);
        System.out.println("Set is = "+lh);
        lh.remove(32);
        System.out.println("Set is = "+lh);
        int n=lh.size();
        System.out.println("Size of set = "+n);
        lh.remove(2);
        System.out.println("Set = "+lh);
		
	}

}
