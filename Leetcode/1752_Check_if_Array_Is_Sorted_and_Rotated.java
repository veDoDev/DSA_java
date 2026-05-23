class Solution {
    public boolean check(int[] nums) 
    {
        int n = nums.length;
        int i = 0;

        //trsverse till peak
        while(i+1 < n && nums[i] <= nums[i+1])
            i++; 

        //return if 0 rotation
        if(i == n-1)
            return true;
        
        //traverse till ascend
        i++;
        while(i+1 < n && nums[i] <= nums[i+1])
            i++;
        
        return (i == n-1) && (nums[n-1] <= nums[0]);
    }
}
