//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends

class Solution
{
    public static int getFirstSetBit(int n)
    {
        int pos = 1;
        if(n == 0)
        {
            return 0;
        }
        for(int i = 2; n%i == 0; i = i*2)
        {
            if(i < n)
            {
                if(n%i != 0)
                    return pos;
            }
            
            pos++;
        }
        return pos;
    }
}
