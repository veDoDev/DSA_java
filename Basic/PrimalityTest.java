//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Solution obj=new Solution ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPrime(int n) {
      if (n == 1)   return false;
      
      for(int i=2; i*i <= n; i++)
      {
          if(n%i == 0)  return false;
      }
      return true;
    }
}
