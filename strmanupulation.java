package stringsop.java;

public class strmanupulation {

	public static void main(String[] args) {
		String n1="Corona";
		String n2="Virus";
		String n3=" Today is a great day ";
			System.out.println("First string: "+n1+"\nSecond string: "+n2);
			System.out.println(n1.charAt(4));
			System.out.println(n1.compareTo(n2));
			System.out.println(n1.concat(n2));
			System.out.println(n1.contains("na"));
			System.out.println(n2.contains("hoi"));
			char[] n5 = {'b','e','n','z'};
		    String n4 = "";
		    n4 = n4.copyValueOf(n5, 0, 4);
		    System.out.println("Returned String: " + n4);
		    System.out.println(n1.equals(n2));
		    System.out.println(n2.hashCode());
		    System.out.println(n3.indexOf("great"));
		    System.out.println(n2.isEmpty());
		    System.out.println(n3.lastIndexOf("day"));
		    System.out.println(n1.length());
		    System.out.println(n3.length());
		    System.out.println(n2.replace("u", "a"));
		    System.out.println(n1.toLowerCase());
		    System.out.println(n2.toUpperCase());
		    System.out.println(n3.trim());
		    System.out.println(n1.endsWith("ona"));
		    String n6=String.valueOf(n5);
		    System.out.println(n6);
		   
		    
		  }	
		

	}

