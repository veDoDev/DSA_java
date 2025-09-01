class Solution {
    public int largestAltitude(int[] gain) 
    {
        int currPeak = Math.max(0, gain[0]);

        for(int i = 1; i < gain.length; i++)
        {
            gain[i] += gain[i-1];

            currPeak = Math.max(gain[i], currPeak);
        }

        return currPeak;
        
    }
}
