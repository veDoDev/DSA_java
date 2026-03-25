class Solution {
    public int splitArray(int[] nums, int k) 
    {
        int n = nums.length;
        int high = 0;
        int low = -1;
        
        //find the upperLim nd lowerLim
        for(int x : nums)
        {
            high += x;
            low = Math.max(low, x);
        }

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int currSplits = numberOfSplitsBy(nums, mid);
            if(currSplits <= k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public int numberOfSplitsBy(int[] arr, int maxSum)
    {
        int n = arr.length;
        int splits = 1;
        int currSum = 0;

        for(int x : arr)
        {
            currSum += x;
            if(currSum > maxSum)
            {
                splits++;
                currSum = x;
            }
        }

        return splits;
    }
}
