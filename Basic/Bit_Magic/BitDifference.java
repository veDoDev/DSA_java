//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
        if(a > b)
        {
            a = a+b;
            b = a-b;
            a = a-b;
        }
        int len = (int)(Math.log(b)/Math.log(2));
        int diff = 0,Alsb,Blsb;
        for(int i = 0; i <= len; i++)
        {
            Alsb = a%2;
            Blsb = b%2;
            if((Alsb^Blsb) == 1) diff++;
            a = a>>1;
            b = b>>1;
        }
        return diff;
        
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends
