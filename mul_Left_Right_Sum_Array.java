import java.lang.*;
import java.io.*;
import java.util.*;
class mul_Left_Right_Sum_Array
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n= sc.nextInt();
	       int a[]=new int[n];
	       for(int i=0; i<n; i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       if(n%2!=0)
	       {
	       int fsum=0;
	       for(int i=0; i<(n-1)/2; i++)
	       {
	           fsum+=a[i];
	       }
	       int lsum=0;
	       for(int i=(n-1)/2; i<n; i++)
	       {
	           lsum+=a[i];
	       }
	       System.out.println(fsum*lsum);
	       }
	       else
	       {
	       int fsum=0;
	       for(int i=0; i<n/2; i++)
	       {
	           fsum+=a[i];
	       }
	       int lsum=0;
	       for(int i=n/2; i<n; i++)
	       {
	           lsum+=a[i];
	       }
	       System.out.println(fsum*lsum);
	       }
	   }
	 }
     }