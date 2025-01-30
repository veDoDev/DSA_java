//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


// } Driver Code Ends

class Solution
{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num)
    {
        int inc = 0, dec = 0;
        for(int i = 0; i < num-1; i++)
        {
            if(arr[i] > arr[i+1])   dec++;
            else if(arr[i] < arr[i+1]) inc++;
        }
        
        if(inc == 1 || dec == 1)  return true;
        return false;
    }
    
}




//{ Driver Code Starts.

class Main {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		   
		 Solution obj = new Solution();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No"); // print the result
        else
            System.out.println("Yes");
		
System.out.println("~");
}
	}
}

// } Driver Code Ends
