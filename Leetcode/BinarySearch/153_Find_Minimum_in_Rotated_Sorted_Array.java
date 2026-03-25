class Solution {
    public int findMin(int[] nums) 
    {
        int n = nums.length;

        int low = 0;
        int high = n-1;

        if(n == 1)
            return nums[0];

        if(nums[0] < nums[n-1])
            return nums[0];

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(mid < n-1 && nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if(mid > 0 && nums[mid] < nums[mid - 1])
                return nums[mid];

            if(nums[mid] < nums[low])
                high = mid - 1;
            else
                low = mid + 1;            
        }

        return nums[0];
        
    }
}
