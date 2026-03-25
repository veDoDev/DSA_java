class Solution {
    public int minRemoval(int[] nums, int k) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int minEle = n;
        int j = 1;

        for(int i = 0; i < n; i++)
        {
            while(j < n && (long)nums[i]*k >= nums[j])
                j++;

            
            minEle = Math.min(minEle, n - (j-i));
        }

        return minEle;

        
    }
}
