//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


// } Driver Code Ends


class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) 
    {
        if(n < 2)   return 0;
        
        int currDiff = Math.abs(arr[0] - arr[1]);
        int minDiff = currDiff;
        
        for(int i = 1; i < n; i++)
        {
            if(i == n-1)    currDiff = Math.abs(arr[i] - arr[0]);
            else    currDiff = Math.abs(arr[i] - arr[i+1]);
            
            if(currDiff < minDiff) minDiff = currDiff;
        }
        
        return minDiff;
    }
}



//{ Driver Code Starts.


class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)//While testcases exist
		{
		    //Input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    
		    //Array of size n
		    int arr[] = new int[n];
		    
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //input elements of array
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		
System.out.println("~");
}
	}
}

// } Driver Code Ends
