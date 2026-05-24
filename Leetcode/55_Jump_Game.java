class Solution {
    public boolean canJump(int[] nums) 
    {
        int n = nums.length;
        int limit = 0;

        for(int i = 0; i <= limit; i++)
        {
            if(i + nums[i] > limit)
                limit = i + nums[i];
            if(limit >= n-1)
                return true;
        }

        return false;
    }
}
