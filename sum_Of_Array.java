import java.util.*;
class sum_Of_Array
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	   int T = sc.nextInt();
	   while(T-->0)
	   {
	       int N = sc.nextInt();
	       int arr[] = new int[N];
	       int sum = 0;
	       for(int i=0; i<N; i++)
	       {
	           arr[i] = sc.nextInt();
	       }
	       for(int i=0; i<N; i++)
	       {
	           sum += arr[i];
	       }
	       System.out.println(sum);
	   }
	 }
}