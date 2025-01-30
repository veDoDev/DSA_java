//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//testcase
		int T=sc.nextInt();
		
		//looping testcase
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //number of elements in array
		    N=sc.nextInt();
		    int a[]=new int [N];
		    
		    //inseting elements in the array
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    
		    //calling mean() and median() functions
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));
		   
		    
		
System.out.println("~");
}
		
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       if(N%2 == 0) return A[(N/2)-1];
       return A[N/2];
    }
    
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       int arrSum = 0;
       
       for(int i = 0; i < N; i++)   arrSum += A[i];
       
       return arrSum/N;
    }

}

