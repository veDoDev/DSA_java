class Solution {
    public long gcdSum(int[] nums) 
    {
        int n = nums.length;
        long[] prefixGcd = new long[n];
        int currMax = -1;

        // phase 1 : gcd (mxi, nums[i])
        for(int i = 0; i < n; i++)
        {
            currMax = Math.max(currMax, nums[i]);
            prefixGcd[i] = gcd(currMax, nums[i]);
        }

        Arrays.sort(prefixGcd);
        long res = 0;

        // phase 2 : pair the corners
        for(int i = 0; i < n/2; i++)
        {
            int c = n-i-1;
            res += gcd(prefixGcd[i], prefixGcd[c]);
        }

        return res;
    }

    // this is big
    public long gcd(long a, long b)
    {
        return ((b == 0) ? a : gcd(b, a%b));
    }
}
