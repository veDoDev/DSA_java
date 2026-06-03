class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) 
    {
        int n = arr.length;
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        int totSum = 0;
        HashSet<Integer> uniq = new HashSet<>();
        
        for(int i = 0; i < n; i++)
        {
            totSum += arr[i];
            if(uniq.contains(totSum) || )
                return true;
                
            uniq.add(totSum);
                
            if(arr[i] == 0 || totSum == 0)
                return true;
            // suffix[n-i-1] = (i > 0) ? (suffix[n-i-2] + arr[n-i-1]) : (arr[n-i-1]);
        }
        
        return false;
    }
}
