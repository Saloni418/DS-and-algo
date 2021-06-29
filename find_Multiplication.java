import java.lang.*;
import java.io.*;
import java.util.*;
class find_Multiplication
 {
	public static void main (String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       int a[]= new int[n];
	       for(int i=0; i<n; i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       
	       int m=sc.nextInt();
	       int b[]=new int[m];
	       for(int i=0; i<m; i++)
	       {
	           b[i]=sc.nextInt();
	       }
	       
	       Arrays.sort(a);
	       Arrays.sort(b);
	       
	       int prod=a[n-1]*b[0];
	       System.out.println(prod);
	   }
	 }
}