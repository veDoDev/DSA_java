class Solution {
    public int maxProduct(int[] nums) 
    {
        int n = nums.length;

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for(int x : nums)
        {
            if(x >= m1)
            {
                m2 = m1;
                m1 = x;
            }
            else if(x > m2)
                m2 = x;
        }

        return (m1-1)*(m2-1);
    }
}
