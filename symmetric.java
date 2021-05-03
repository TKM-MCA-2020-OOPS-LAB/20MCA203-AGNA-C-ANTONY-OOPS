package work2.java;
import java.util.Scanner;


public class symmetric {

	public static void main(String[] args) {
		int m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter row and col size");
		m=s.nextInt();
		n=s.nextInt();
int a[][]= new int[m][n];
int b[][]= new int[m][n];
System.out.println("enter values of  matrix");
for(int i =0;i<m;i++)
	for(int j=0;j<n;j++)
		a[i][j]=s.nextInt();
System.out.println("The given matrix is: ");  
for( int i=0;i<m;i++){
	 for( int j=0;j<n;j++)
		 System.out.print(a[i][j]+"\t");  
System.out.println();

	}
for(int i =0;i<m;i++)
	for(int j=0;j<n;j++)
		b[j][i]=a[i][j];
System.out.println("The transpose matrix is: ");  
for( int i=0;i<m;i++){
	 for( int j=0;j<n;j++)
		 System.out.print(b[i][j]+"\t");  
System.out.println();

	}

if(m !=n)
{
    System.out.println("The given matrix is not a square matrix, so it not a symmetric matrix.");
}
for( int i=0;i<m;i++){
	 for( int j=0;j<n;j++)  
		 if(a[i][j]!=b[i][j]) { 
			 System.out.println("The given matrix is not  symmetric "); 
			 System.exit(0);
			 
			 }
		 }

System.out.println("The given matrix is a symmetric matrix.");
}

}

