class Solution {
    public boolean isGood(int[] nums)
    {
        int n = nums.length;
        boolean[] numsFound = new boolean[n+1];
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            if(nums[i] >= n+1)
                return false;
            if(numsFound[nums[i]])
            {
                if(nums[i] == n-1 && !numsFound[0])
                {
                    numsFound[0] = true;
                    sum += nums[i];
                }
                
                else return false;
            }
            else
            {
                numsFound[nums[i]] = true;
                sum += nums[i];
            }
                
        }
            
        return ( (((n*(n-1)) /2) + n-1) == sum); 
        
    }
}
