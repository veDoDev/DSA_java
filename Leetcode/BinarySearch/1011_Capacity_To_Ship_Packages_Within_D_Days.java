class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int n = weights.length;
        int maxCap = 0,minCap = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            maxCap += weights[i];
            minCap = Math.max(minCap, weights[i]);
        }

        // if the capacity = maxCap; the samaan can be shiped in 1 day
        // similarly, if the capacity is 1, the number of days is maxCap

        int high = maxCap;
        int low = minCap;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int currDays = daysIfCapacityIs(mid, weights);

            if(currDays <= days)
                high = mid - 1;
            else
                low = mid + 1;               
        }

        return low;
    }

    public int daysIfCapacityIs(int cap, int[] weights)
    {
        int currDays = 1;
        int currWt = 0;
        // int capacityCarry = 0;

        for(int i = 0; i < weights.length; i++)
        {
            if(currWt + weights[i] > cap)
            {
                currDays++;
                currWt = 0;
            }
            currWt += weights[i];
        }

        return currDays;
    }
}
