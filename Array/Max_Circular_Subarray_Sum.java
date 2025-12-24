class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int maxSum = arr[0];
        int currMax = 0;
        int minSum = arr[0];
        int currMin = 0;
        int puraSum = 0;
        int idx;
        
        for(int i = 0; i < n; i++)
        {
            currMax = Math.max(arr[i], currMax + arr[i]);
            currMin = Math.min(arr[i], currMin + arr[i]);
            
            maxSum = Math.max(currMax, maxSum);
            minSum = Math.min(currMin, minSum);
            
            puraSum += arr[i];
        }
    
        return (maxSum < 0) ? (maxSum) : (Math.max(maxSum, puraSum - minSum));
    }
}
