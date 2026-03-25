class Solution {
    public int binaryGap(int n) 
    {
        int prev1 = -1;
        int maxGap = 0;

        for(int idx = 0; n > 0; idx++)
        {
            if((n&1) == 1)
            {
                if(prev1 != -1)
                    maxGap = Math.max(maxGap, idx - prev1);
                prev1 = idx;
            }

            n >>= 1;
        }

        return maxGap;
        
    }
}
