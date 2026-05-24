class Solution {
    public int minOperations(int[] nums) 
    {
        int n = nums.length;

        int rotK = getRotationIndex(nums, n, true);

        int revRotK = getRotationIndex(nums, n, false);

        int ans = Integer.MAX_VALUE;

        if(rotK != -1)
        {
            int c1 = rotK;
            int c2 = (n-rotK) %n +2;
            ans = Math.min(ans, Math.min(c1, c2));
        }

        if(revRotK != -1)
        {
            int c1 = 1+revRotK;
            int c2 = (n-revRotK) % n + 1;
            ans = Math.min(ans, Math.min(c1, c2));
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int getRotationIndex(int[] a, int n, boolean seedhe)
    {
        int zeroPos = -1;

        for(int i = 0; i < n; i++)
        {
            if(a[i] == 0)
            {
                zeroPos = i;
                break;
            }
        }

        if(zeroPos == -1)
            return -1;

        for(int i = 0; i < n; i++)
        {
            int expVal = i;
            int actualIdx = seedhe ? (zeroPos + i)%n : (zeroPos-i+n)%n;

            if(a[actualIdx] != expVal)
                return -1;
        }

        if(!seedhe)
            return n-1-zeroPos;

        return zeroPos;
        
    }
}
