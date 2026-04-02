class Solution {
    public int minAbsoluteDifference(int[] nums) 
    {
        int n = nums.length;
        int onePtr = -1, twoPtr = -1;
        int top = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++)
        {
            if(nums[i] == 1)
            {
                onePtr = i;
                if(twoPtr == -1)
                    top = 1;
                else
                {
                    minDiff = Math.min(minDiff, Math.abs(onePtr - twoPtr));
                    twoPtr = -1;
                }
            }
            else if(nums[i] == 2)
            {
                twoPtr = i;
                if(onePtr == -1)
                    top = 1;
                else
                {
                    minDiff = Math.min(minDiff, Math.abs(onePtr - twoPtr));
                    onePtr = -1;
                }
                
            }
        }

        return (minDiff > 100) ? (-1) : (minDiff);               
    }
}
