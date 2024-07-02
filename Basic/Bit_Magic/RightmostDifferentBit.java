//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends




//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m == n)  return -1;
        if(n > m)
        {
            m = m+n;
            n = m-n;
            m = m-n;
        }
        // we know, m > n
        int pos = 1;
        int len = (int)(Math.log(m)/Math.log(2));
        for(int i = 1; i <= len; i++)
        {
            
            if((m&1) != (n&1))  return pos;
            m = m>>1;
            n = n>>1;
            pos++;
        }
        return pos;
        
    }
}


