class Solution {
    public int countMajoritySubarrays(int[] nums, int target) 
    {
        int n = nums.length;
        int count = 0;

        int[] freqPrefix = new int[n+1];

        for(int i = 0; i < n; i++)
            freqPrefix[i+1] = freqPrefix[i] + (nums[i] == target ? 1 : 0);

        int currFreq;
        for(int winLen = 1; winLen <= n; winLen++)
        {
            for(int winPos = 0; winPos+winLen-1 < n; winPos++)
            {
                currFreq = freqPrefix[winPos+winLen] - freqPrefix[winPos];
                
                if((currFreq<<1) > winLen)
                    count++;
            }
        }

        return count;
    }
}
