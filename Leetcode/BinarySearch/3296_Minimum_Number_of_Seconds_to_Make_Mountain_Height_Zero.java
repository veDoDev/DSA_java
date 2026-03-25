class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) 
    {
        // workerTimes[i] + workerTimes[i]*2 + ... + workerTimes[i]*n
        // workerTimes[i] * (1 + 2 + 3 + ... + n)
        // workerTimes[i] * (n * (n + 1)) / 2

        long low = 0;
        long high = Long.MIN_VALUE;

        for(int time : workerTimes)
            high = Math.max(high, time);

        // worst case --> slowest worker removes entire mountain
        high = high * ((long) mountainHeight * (mountainHeight + 1)) / 2;

        while(low <= high)
        {
            long mid = low + (high - low) / 2;

            long reducedHeight = heightReducedIn(mid, workerTimes, mountainHeight);

            if(reducedHeight >= mountainHeight)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public long heightReducedIn(long allowedTime, int[] workerTimes, int targetHeight)
    {
        long totalHeight = 0;

        //     | -1 (+/-) sqrt(1 + (8T / t)) |
        //  h =|-----------------------------|  
        //     |             2               |max
        
        // quadratic equation:
        // h^2 + h - (2T / t) = 0
        //
        // h --> height reduced
        // T --> allowedTime
        // t --> workerTimes[i]

        for(int time : workerTimes)
        {
            long D = (long)Math.sqrt(1 + (8 * allowedTime) / time);
            long height = (-1 + D) / 2;

            totalHeight += height;

            if(totalHeight >= targetHeight)
                return totalHeight;
        }

        return totalHeight;
    }
}   
