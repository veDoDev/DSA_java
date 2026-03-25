class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int right = 0; right < nums.length; right++)
        {
            if(!set.add(nums[right]))
                return true;
            
            if(right - left >= k)
            {
                set.remove(nums[left]);
                left++;
            }
        }

        return false;

        
    }
}
