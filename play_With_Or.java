import java.lang.*;
import java.io.*;
import java.util.*;
class play_With_Or
 {
	public static void main (String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0)
	  {
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      for(int i=0; i<n; i++)
	      {
	          a[i] = sc.nextInt();
	      }
	      for(int i=0; i<n; i++)
	      {
	          if(i<n-1)
	          {
	              a[i]=a[i] | a[i+1];
	             System.out.print(a[i]+" ");
	          }
	          else
	          System.out.print(a[i]+" ");
	      }
	      System.out.println();
	  }
	 }
}