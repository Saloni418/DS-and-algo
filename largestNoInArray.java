import java.util.*;
import java.io.*;
class largestNoInArray
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int T = sc.nextInt();
	   int TC[] = new int[T];
	   for(int i=0; i<T; i++)
	   {
		   int N = sc.nextInt();
		   int array[] = new int[N];
		   for(int j=0; j<N; j++)
		   {
			   array[j] = sc.nextInt();
		   }
		   int temp = array[0];
		   for(int k=0; k<N; k++)
		   { 
			   if(array[k] > temp)
			   temp = array[k];
		   }
		   System.out.println(temp);
	   }
     }
 }