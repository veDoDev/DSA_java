//------------------------------------------------------------------------------------------Approach 1---------------------------------------------------------------------------------------------------------------------
class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int maxBanana = 0;

        for(int i = 0; i < n; i++)
            maxBanana = (piles[i] > maxBanana) ? piles[i] : maxBanana;

        int high = maxBanana;
        int low = 1;
        int minK = high;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            long hrs = hoursTakenBy(mid, piles);

            if(hrs <= h)
            {
                high = mid - 1;
                minK = Math.min(minK, mid);
            }
            else
                low = mid + 1;
        }

        return minK;
    }

    public long hoursTakenBy(int k, int[] piles)
    {
        long iters = 0;

        for(int i = 0; i < piles.length; i++)
            iters += (int)Math.ceil(1.0*piles[i] / k);

        return iters;        
    }
}
//------------------------------------------------------------------------------------------Approach 2 (Micro Optimised)---------------------------------------------------------------------------------------------------
class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int maxBanana = 0;

        for(int i = 0; i < n; i++)
            maxBanana = (piles[i] > maxBanana) ? piles[i] : maxBanana;

        int high = maxBanana;
        int low = 1;
        int minK = high;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            long hrs = hoursTakenBy(mid, piles, h);

            if(hrs <= h)
            {
                high = mid - 1;
                minK = Math.min(minK, mid);
            }
            else
                low = mid + 1;
        }

        return minK;
    }

    public long hoursTakenBy(int k, int[] piles, int h)
    {
        long iters = 0;

        for(int i = 0; i < piles.length; i++)
        {
            iters += (piles[i] + k - 1) / k; //manually re-written Math.ceil() because conversion between data structure costs more
            if (iters > h) return iters;
        }
            

        return iters;        
    }
}
