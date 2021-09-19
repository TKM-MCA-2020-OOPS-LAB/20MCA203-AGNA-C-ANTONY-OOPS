package co6q2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereadwrite {
	 public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("attemptjava.txt", true);
	            writer.write("Data written to the file \n");
		        writer.write("Hello! How are you ?\n");
	            writer.write("Fine,Thanks.");
	            writer.close();
	            FileReader reader = new FileReader("attemptjava.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	            String line;
	 	        System.out.println("Data read from the file");
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            System.out.println("Error ");
	        }
	 
	    }

}
