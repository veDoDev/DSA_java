//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		
System.out.println("~");
}
		
	}
}


// } Driver Code Ends




class Solution
{
   public int josephus(int n, int k)
    {
        if(n==1)    return n;
        if(n==2)    return (k%n)+1;
        int newZero = k%n;
        int lastAlive = newZero + josephus(n-1,k);
        
        if (lastAlive > n)  return lastAlive%n;
        return lastAlive;
    }

}
