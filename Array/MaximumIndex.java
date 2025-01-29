//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxIndexDiff(nums));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

class Solution {

    int maxIndexDiff(int[] arr)
    {
       int n = arr.length;
       int[] Lmin = new int[n];
       int[] Rmax = new int[n];
       
       Lmin[0]  = arr[0];
       for(int i = 1; i < n; i++)   Lmin[i] = Math.min(Lmin[i-1], arr[i]);
       Rmax[n-1] = arr[n-1];
       for(int j = n-2; j>= 0; j--) Rmax[j] = Math.max(Rmax[j+1], arr[j]);
       
       int i = 0, j = 0, diff = -1;
       while(i < n && j < n)
       {
           if(Lmin[i] <= Rmax[j])
           {
               diff = Math.max(diff, j - i);
               j++;
           }
           else i++;
           
       }
       return diff;
        
    }
    
}
