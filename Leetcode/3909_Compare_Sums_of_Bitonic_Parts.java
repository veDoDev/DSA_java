class Solution {
    public int compareBitonicSums(int[] nums) 
    {
        int n = nums.length;
        int i = 0;

        //calc the asc part
        long ascSum = 0;
        while(nums[i] < nums[i+1])
        {
            ascSum += nums[i];
            i++;
        }

        ascSum += nums[i];

        long descSum = nums[i++];
        while(i < n)
        {
            descSum += nums[i];
            i++;
        }

        if(ascSum > descSum)
            return 0;

        return (descSum > ascSum)?(1):(-1);
    }
}
