//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
        


// Solution class to implement function largestAndSecondLargest
class Solution{
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        if(sizeOfArray == 1)    return new ArrayList<Integer>() {{ add(arr[0]); add(-1); }};
        
        ArrayList<Integer> topTwo = new ArrayList<Integer>();
        int first = arr[0], secnd = Integer.MIN_VALUE;
        
        for(int i = 1; i < sizeOfArray; i++)
        {
            if(arr[i] > first)
            {
                secnd = first;
                first = arr[i];
            }
            else if(arr[i] > secnd && arr[i] != first)
            {
                secnd = arr[i];
            }
        }
        
        topTwo.add(first);
        topTwo.add(secnd);
        
        return topTwo;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		
System.out.println("~");
}
	}
}
// } Driver Code Ends
