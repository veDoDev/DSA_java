class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int n = nums.length;
        int midEle = nums[n/2];
        nums[n/2] = -1;

        for(int x : nums)
            if(x == midEle)
                return false;

        return true;
    }
}
