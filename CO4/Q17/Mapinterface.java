package co4q17;
import java.util.*;

public class Mapinterface {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		 
		 map.put(1,"THRISSUR");
		 map.put(2, "ERNAKULAM");
		 map.put(3, "PALAKKAD");
                map.put(4, "KOLLAM");
		 System.out.println("Printing initial map: "+map);
		 
		 map.put((3),"KOCHI");
		 map.put((2), "TRICHI");
		 System.out.println("Updated map: "+map);
		 
		 map.remove(4);
		 System.out.println("Map after removal: "+map);
	}
}


