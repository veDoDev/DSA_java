//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    
    public int exactly3Divisors(int N)
    {
        int count = 0;
        for(int i = 1; i*i <= N; i++)
        {
            if(isPrime(i))  count++;
        }
        return count;
    }
    public boolean isPrime(int n) {
      if (n == 1)   return false;
      
      for(int i=2; i*i <= n; i++)
      {
          if(n%i == 0)  return false;
      }
      return true;
    }
}
