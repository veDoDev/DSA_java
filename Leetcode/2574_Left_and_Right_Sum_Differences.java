class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int n = nums.length;
        int[] res = new int[n];
        int totSum = 0;
        int leftSum = 0;

        for(int x : nums)
            totSum += x;

        for(int i = 0; i < n; i++)
        {
            totSum -= nums[i];
            res[i] = Math.abs(totSum-leftSum);
            leftSum += nums[i];
        }

        return res;
    }
}
