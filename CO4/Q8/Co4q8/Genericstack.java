package Co4q8;

public class Genericstack {
	private int arr[];
	private int top;
	public Genericstack(int size) {
		arr=new int[size];
		top=-1;
	}
	public void push(int i) {
		if (isFull()) {
			 System.out.println("OverFlow");
			
		}
		else {
			System.out.println( "Inserting " + i);
            arr[++top] = i;
		}
	}
	private boolean isFull() {
		return false;
	}
	public int pop() {
		if (isEmpty()) {
            System.out.println("STACK EMPTY");
		}
		else {
			System.out.println( "removing " + arr[top] );
			 return arr[top--];
		}
		return 0;
	}
	private boolean isEmpty() {
		return false;
	}
	public void displayStack() {
		System.out.println( "array elements are;");
        for (int i = 0; i <= top; i++) {
        	System.out.println(arr[i]);
        	}
    
        
    }
	

}
