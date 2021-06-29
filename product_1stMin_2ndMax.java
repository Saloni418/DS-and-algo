import java.util.*;
class product_1stMin_2ndMax
 {
	public static void main (String[] args)
	 {
      	int T,ASize,Sum=0;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		long summ[]=new long[T];
		for(int i=0;i<T;i++)
		{
		    Sum=0;
		    ASize=sc.nextInt();
		    int array[]=new int[ASize];
		    for(int j=0;j<ASize;j++)
		    {
		        array[j]=sc.nextInt();
		    }
		    for(int k=0;k<array.length;k++)
		    {
		        Sum+=array[k];
		        
		    }
		    summ[i]=Sum;
            System.out.println(summ[i]);
      }
      sc.close();
		
   }
   }