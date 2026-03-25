//---------------------------------------------------------------------------------------Approach 1 : Sort the array----------------------------------------------------------------------------------------------------------
class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        Arrays.sort(nums1);
        if(nums1[0] % 2 == 1)
            return true;

        int n = nums1.length;

        for(int i = 0; i < n; i++)
        {
            if(nums1[i] % 2 == 1)
                return false;
        }

        return true;
        
    }
}
//---------------------------------------------------------------------------------------Approach 1 : O(n) to find the min-----------------------------------------------------------------------------------------------------
class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        int min = Integer.MAX_VALUE;
        int n = nums1.length;

        for(int i = 0; i < n; i++)
            min = Math.min(min, nums1[i]);

        if(min% 2 == 1)
            return true;

        for(int i = 0; i < n; i++)
        {
            if(nums1[i] % 2 == 1)
                return false;
        }

        return true;
        
    }
}
