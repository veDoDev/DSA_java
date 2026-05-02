class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        int n = nums.length;
        int missing = -1;
        int dble = -1;
        int allSum = 0;
        boolean[] found = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            if(found[nums[i] - 1])
                dble = nums[i];
            else
            {
                allSum += nums[i];
                found[nums[i] - 1] = true;
            }
        }
        missing = ((n*(n+1))/2) - allSum;

        return new int[]{dble, missing};    
    }
}
