class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int n = nums.length; 
        //intuition : take an example : 11 44 55 6 77 88 99 10 10
        // idxs of : 
        // 1 -> 0,1
        // 5 -> 4,5
        // 6 -> 6
        // 7 -> 7,8
        // 8 -> 9,8

        // elements before the single element appears : pair : (even odd)
        // elements after the single element appears : par : (odd even)

        int high = n-1;
        int low = 0;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(mid%2 == 0)
            {
                if(mid > 0 && nums[mid-1] == nums[mid])
                    high = mid-1;
                else if(mid < n-1 && nums[mid+1] == nums[mid])
                    low = mid+1;
                else
                    return nums[mid];
            }
            else
            {
                if(mid < n-1 && nums[mid+1] == nums[mid])
                    high = mid - 1;
                else if(mid > 0 && nums[mid-1] == nums[mid])
                    low = mid+1;
                else
                    return nums[mid];
            }
        }

        return nums[low];

    }
}
