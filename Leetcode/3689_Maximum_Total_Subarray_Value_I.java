class Solution {
    public long maxTotalValue(int[] nums, int k) 
    {
        int n = nums.length;

        long maxVal = Integer.MIN_VALUE;
        long minVal = Integer.MAX_VALUE;
        for(int x : nums)
        {
            maxVal = Math.max(maxVal, x);
            minVal = Math.min(minVal, x);
        }

        return (maxVal - minVal)*k;
    }
}
