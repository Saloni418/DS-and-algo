import java.lang.*;
import java.io.*;
import java.util.*;
class find_min_max
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       int a[] = new int[n];
	       for(int i=0; i<n; i++)
	       {
	           a[i] = sc.nextInt();
	       }
	       int max=0;
	       int min=a[0];
	       for(int i=0; i<n; i++)
	       {
	           if(a[i]>max)
	           {
	               max=a[i];
	           }
	           else if(a[i]<min)
	           {
	               min=a[i];
	           }
	       }
	       System.out.println(min+" "+max);
	   }
	 }
}