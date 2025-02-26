//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().rearrange(arr);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            // System.out.println();

            System.out.println();

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[]) 
    {
        int n = arr.length;
        
        Arrays.sort(arr);
        int max = arr[n-1] + 1;
        int max_idx = n-1, min_idx = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)  
            {
                arr[i] = (arr[max_idx] % max)*max + arr[i];
                max_idx--;
            }
            else    
            {
                arr[i] = (arr[min_idx] % max)*max + arr[i];
                min_idx++;
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            arr[i] /= max;
        }
    }
}
