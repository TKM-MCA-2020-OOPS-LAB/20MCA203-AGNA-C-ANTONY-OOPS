package co1.java;
import java.util.Scanner;
public class addmatri {
	public static void main(String[] args) {
		int m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter row and col size");
		m=s.nextInt();
		n=s.nextInt();
int a[][]= new int[m][n];
int b[][]= new int[m][n];
int c[][]= new int[m][n];
System.out.println("enter values of first matrix");
for(int i =0;i<m;i++)
	for(int j=0;j<n;j++)
		a[i][j]=s.nextInt();
System.out.println("enter values of second matrix");
for(int i =0;i<m;i++)
	for(int j=0;j<n;j++)
		b[i][j]=s.nextInt();
for(int i =0;i<m;i++)
	for(int j=0;j<n;j++)
		c[i][j]=a[i][j]+b[i][j];
System.out.println("Sum of matrices: ");  
for( int i=0;i<m;i++){
	 for( int j=0;j<n;j++)
		 System.out.print(c[i][j]+"\t");  
System.out.println();
}  	


	}

}
