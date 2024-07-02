//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n)
    {
        int MaxPow = maxPow(n);
        int ans = n/2;
        for(int pow = 4; pow <= MaxPow; pow = pow*2 )
        {
            ans = ans + ((n/pow)*(pow/2));
            if  ((n%pow) >= (pow/2))
                ans = ans + ((n%pow) - (pow/2));
        }
        ans = ans + BrianKerningam(n);
        return ans;
    }
    public static int maxPow(int x)
    {
        int powr = 1;
        while (powr <= x)
            powr = powr*2;
            
        return powr;
    }
    public static int BrianKerningam(int y)
    {
        int[] tbl = new int[256];
        tbl[0] = 0;
        for(int i = 1; i<256; i++)
        {
            tbl[i] = tbl[i&(i-1)]+1;
        }
        
        return (tbl[y&255] + tbl[(y>>8)&255] + tbl[(y>>16)&255] + tbl[(y>>24)]);
    }
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends
