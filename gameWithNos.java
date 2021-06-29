import java.lang.*;
import java.io.*;
import java.util.*;
class gameWithNos
 {
	public static void main (String[] args)
	 {
       Scanner sc=new Scanner(System.in);
       int t= sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0; i<n; i++)
           {
               a[i]= sc.nextInt();
           }
           int b[]= new int[n];
           for(int i=0; i<n; i++)
           {
               if(i==n-1)
               b[i]=a[n-1];
               else
               b[i]=a[i]^a[i+1];
           }
           for(int item:b)
           {
               System.out.print(item+" ");
           }
           System.out.println();
       }
	 }
}