class Solution {
    public int maxRotateFunction(int[] nums) 
    {
        int n = nums.length;
        int maxRes = Integer.MIN_VALUE;
        int totSum = 0;
        int currSum = 0;

        for(int i = 0; i < n; i++)
        {
            totSum += nums[i];
            currSum += nums[i]*i;
        }

        maxRes = currSum;

        for(int i = 1; i < n; i++)
        {
            currSum = currSum + totSum - (nums[n-i]*n);
            if(maxRes < currSum)
                maxRes = currSum;e
        }

        return maxRes;
    }
}
