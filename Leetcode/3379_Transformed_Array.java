class Solution {
    public int[] constructTransformedArray(int[] nums) 
    {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n ; i++)
        {
            int idx = (((nums[i] + n)%n) + i) % n;

            if(idx < 0)
                idx += n;

            res[i] = nums[idx];       
        }

        return res;
    }
}
