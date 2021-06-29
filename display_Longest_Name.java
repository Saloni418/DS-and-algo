import java.lang.*;
import java.io.*;
import java.util.*;
class display_Longest_Name
 {
	public static void main (String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();
	  while(T-->0)
	  {
		  int N = sc.nextInt();
		  String array[] = new String[N];
		  int Max = 0;
		  for(int j=0; j<N; j++)
		  {
			  array[j] = sc.next();
		  }
		  String s = " ";
		  for (int j=0; j<N; j++)
		  {
			  if(Max < array[j].length())
			  {
				  Max = array[j].length();
				  s = array[j];
			  }
		  }
		  System.out.println(s);
	  }
	 
	  sc.close();
		
   }
   }