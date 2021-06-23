package co4q9;

public class Bubblesort {
	void sort(int arr[],int n) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}
	void display(int arr[],int n) {
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
   
     }
}
