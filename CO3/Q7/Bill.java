package bill.java;
import java.util.*;


 class Bill implements Billcalculation {
	 int ordno=456;
	 int proid1=101;
	 int proid2=102;
	 int qnty1=2;
	 int qnty2=1;
	 int unit=25;
	 int unit1=50;
	 String item1="A";
	 String item2="B";
	 int total1=50;
	 int total2=100;
	 
	 public void display() {
		 System.out.println("Order No:"+ordno);
		 System.out.println("Date:"+java.time.LocalDate.now());
		 System.out.println("\nProduct\t Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
		 System.out.println("________________________________________________________________________________________________________________________________");
		 System.out.println(proid1+"\t\t\t"+item1+"\t\t\t"+qnty1+"\t\t\t\t"+unit+"\t\t\t\t"+total1);
		 System.out.println(proid2+"\t\t\t"+item2+"\t\t\t"+qnty2+"\t\t\t\t"+unit1+"\t\t\t\t"+total2);
		 System.out.println("_________________________________________________________________________________________________________________________________");
		 System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(total1+total2));
		 
	 }
	 
		
	 
	 

	

}
