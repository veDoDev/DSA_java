//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.BigDecimal; 

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}

// } Driver Code Ends


class Solution{
    public int digitsInFactorial(int N){
        if (N == 1)
            return 1;
        
        double digits = 0;
        for(int i = 2; i<=N; i++)
        {
            digits += Math.log10(i); //log(n!) = log(n.(n-1).(n-2)...3.2.1) = log(n) + log(n-1) + log(n-2) + .... + log(2) + log(1)
        }
        return (int)Math.floor(digits)+1;
    }
}
