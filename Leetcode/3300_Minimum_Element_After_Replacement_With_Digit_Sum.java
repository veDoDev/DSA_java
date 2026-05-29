class Solution {
    public int minElement(int[] nums) 
    {
        int n = nums.length;
        int minS = Integer.MAX_VALUE;
        int res = -1;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum = 0;
            while(nums[i] > 0)
            {
                sum += nums[i]%10;
                nums[i] /= 10; 
            }
            if(minS > sum)
            {
                res = i;
                minS = sum;
            }
        }

        return minS;        
    }
}
