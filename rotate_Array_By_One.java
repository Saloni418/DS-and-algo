import java.util.*;
class rotate_Array_By_One
 {
	public static void main (String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       int a[] =new int[n];
	       for(int i=0; i<n; i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       int x=a[n-1];
	       for(int i=n-1; i>=0; i--)
	       {
	           if(i!=0)
	           a[i]=a[i-1];
	           else
	           a[0]=x;
	       }
	       for(int item:a)
	       {
	           System.out.print(item+" ");
	       }
	       System.out.println();
	   }
	 }
}