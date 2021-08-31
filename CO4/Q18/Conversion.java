package co4q18;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		 HashMap<Integer, String> HMap = new HashMap<Integer, String>();
	   	  HMap.put( 49, "Seetha" );
	      HMap.put( 47, "Ram" );
	      HMap.put( 48, "Ally" );
	      HMap.put( 45, "Winny");
	      HMap.put( 46, "Missy");
	      System.out.println("HashMap Keys and Values: "+HMap);
	      System.out.println("\n");
	      TreeMap<Integer, String> TMap = new TreeMap<Integer, String>(HMap);
	      System.out.println("TreeMap Keys and Values: " +TMap);
			
		

	}

}
