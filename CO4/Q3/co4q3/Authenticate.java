package co4q3;
import java.util.*;

public class Authenticate {

	public static void main(String[] args) {
		String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        try {
        	 if((username==""))
        			 throw new UsernameException("Username can't be empty");
        	 if((password==""))
        		 throw new PasswordException("password  can't be empty");
        	 if (!(password.contains("@") || password.contains("#")
                     || password.contains("!") || password.contains("~")
                     || password.contains("$") || password.contains("%")
                     || password.contains("^") || password.contains("&")
                     || password.contains("*") || password.contains("(")
                     || password.contains(")") || password.contains("-")
                     || password.contains("+") || password.contains("/")
                     || password.contains(":") || password.contains(".")
                     || password.contains(", ") || password.contains("<")
                     || password.contains(">") || password.contains("?")
                     || password.contains("|"))) {
                   throw new PasswordException("password must contain any special character");
               }
        	 else if (username.length()<=5) 
        		 throw new UsernameException("Username must be greater than 5 characters!");
        	 
        	 else if (password.length()<8) {
        		 throw new PasswordException("Please enter a strong password");
        	 }
        	 else
        		    System.out.println("Login Successful !!!");
            }
        
         catch (UsernameException e) {
        				 System.out.println("Exception Occurred. . "+e);
        			 }
         catch (PasswordException e) {
        				 System.out.println("Exception Occurred. . "+e);
        			 }
         
        				   
        				  
        			 
        
	}
	

}
