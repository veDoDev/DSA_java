//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) 
    {
        if(arr.length < 2)  return 0;
        int n = arr.length;
        int buyStk = 0, profit = 0;
        boolean canBuy = true; // false = can't buy; true = can buy
        
        for(int i = 0; i < n-1; i++)
        {
            if(canBuy)
            {
                if(arr[i] < arr[i+1])//stock uth gya
                {
                    buyStk = arr[i];
                    canBuy = false;
                }
            }
            else if(arr[i] > arr[i+1])//stock gira
            {
                profit += arr[i] - buyStk;
                canBuy = true;
            }
        }
        
        if(!canBuy) profit += arr[n-1] - buyStk; // if the last activity was buy which was never sold
        return profit;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.stockBuySell(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
