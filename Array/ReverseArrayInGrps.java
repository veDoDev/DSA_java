//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution 
{
    void reverseInGroups(ArrayList<Long> arr, int k) 
    {
        int n = arr.size();
        
        if(k > n)   revGroup(arr, 0, n);
        else
        {
            for(int i = 0; i < n; i += k)
            {
                revGroup(arr, i, Math.min(k + i, n));
            }
        }
        return;
    }
    void revGroup(ArrayList<Long> arr, int start, int end)
    {
        end--;
        Long temp;
        while(start < end)
        {
            temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            end--;
            start++;
        }
    }
}

//{ Driver Code Starts.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends
