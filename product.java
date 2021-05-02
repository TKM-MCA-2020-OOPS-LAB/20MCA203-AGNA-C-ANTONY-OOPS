package work.java;

public class product {
	int pcode;
	String pname;
	int price;

	public static void main(String[] args) {
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
	    obj1.pcode=1103;
	    obj2.pcode=2134;
	    obj3.pcode=0013;
	    obj1.pname="cello";
	    obj2.pname="lexi";
	    obj3.pname="tip";
	    obj1.price=10;
	    obj2.price=5;
	    obj3.price=8;
	    if(obj1.price<obj2.price && obj1.price<obj3.price) {
	        System.out.println("The product with lowest price  is :"+obj1.pname);
	        }
	     if(obj2.price<obj1.price && obj2.price<obj3.price) {
	        System.out.println("The product with lowest price is :"+obj2.pname);
	        }
	      if(obj3.price<obj1.price && obj3.price<obj2.price) {
	        System.out.println("The product with lowest price is :"+obj3.pname);
	        }



	}

}
