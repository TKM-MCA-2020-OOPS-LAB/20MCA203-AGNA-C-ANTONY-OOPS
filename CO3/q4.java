package newon.java;
import java.util.*;
class Publisher
{
   String name;
   Scanner sc=new Scanner(System.in);
 public Publisher()
{
   System.out.println("ENTER THE DETAILS");
   System.out.println("Enter the  Publisher name");
   name = sc.next();
   }  
}
class book extends Publisher
{
   int bookid;
   String book_name;
   int price;
  Scanner sc= new Scanner(System.in);
  public book()
  {
   System.out.println("Enter the id");
   bookid = sc.nextInt();
   System.out.println("Enter the book name");
  book_name = sc.next();
   System.out.println("Enter price");
   price = sc.nextInt();
  } 
}
class literature extends book
{
   String type;
   String discription;
   String author;
   Scanner sc = new Scanner(System.in);
   public  void get()
   {
   System.out.println("Enter the type");
   type = sc.next();
   System.out.println("Enter author");
   author = sc.next();
   }
   public void display()
   {
  System.out.println(" Details ");
  System.out.println("The name of publisher:"+name);
  System.out.println("Book id:"+bookid);
  System.out.println("The name of book:"+book_name);
  System.out.println("Price:"+price);
  System.out.println("Category:"+type);
  System.out.println("Author of book:"+author);
   } 
}
class fiction extends book
{
   String ftype;
   String fauthor;
   Scanner sc = new Scanner(System.in);
   public  void get()
   {
   System.out.println("enter the type");
   ftype = sc.next();
   System.out.println("enter auother");
   fauthor = sc.next();
   }
   public void display()
   {
  System.out.println(" Details ");
  System.out.println("The name of publisher:"+name);
  System.out.println("Book id :"+bookid);
  System.out.println("The name of book:"+book_name);
  System.out.println("Price:"+price);
  System.out.println("Category:"+ftype);
  System.out.println("Author name:"+fauthor);
   } 
}

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Choices are given below");
		System.out.println("1.literature.");
		  System.out.println("2.fiction.");
		  System.out.println("Enter the choice:");
		  Scanner sc =new Scanner(System.in);
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		      case 1: 
		      literature lit =new literature();
		      lit.get();
		      lit.display();
		      break;
		      case 2: 
		      fiction fic =new fiction();
		      fic.get();
		      fic.display();
		      break;
		      default:
		      System.out.println("invalid choice");
		      break;      
		  }
		

	}

}
