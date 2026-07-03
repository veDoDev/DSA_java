class Solution {
    public int[] transformArray(int[] nums) 
    {
        int n = nums.length;
        int oddCount = 0;

        for(int x : nums)
            oddCount += x%2;
        
        int eveCount = (n-oddCount);

        for(int i = 0; i < eveCount; i++)
            nums[i] = 0;

        for(int i = 0; i < oddCount; i++)
            nums[i+eveCount] = 1;

        return nums;
    }
}
