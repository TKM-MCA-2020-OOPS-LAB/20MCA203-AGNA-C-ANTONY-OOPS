package Co4q8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack : ");
		int n = sc.nextInt();
	    Genericstack stack = new Genericstack(n);

		    while (true) {
		        System.out.println("Enter operation : 1)Push 2)Pop 3)Display : ");
		        int choice = sc.nextInt();
		        switch (choice) {
		            case 1:
		                int item = sc.nextInt();
		                stack.push(item);
		                break;
		            case 2:
		                stack.pop();
		                break;
		            case 3:
		                stack.displayStack();
		        }
		    }
		}

	}


