package CO6Q3;
import java.io.*; 
class Copydata 
{ 
             public static void main(String args[])throws IOException 
        { 
              FileInputStream Fr =new FileInputStream("test.txt"); 
              FileOutputStream Fw=new FileOutputStream("try.txt") ; 
              System.out.println("File successfully Copied"); 
              int n; 
              while((n=Fr.read())!=-1) 
              Fw.write((char)n); 
              Fr.close(); 
              Fw.close(); 
         } 
} 