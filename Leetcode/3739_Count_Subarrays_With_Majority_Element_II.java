class Solution {
    public long countMajoritySubarrays(int[] nums, int target) 
    {
        HashMap<Long, Long> mp = new HashMap<>();

        long cumSum = 0;
        mp.put(0L,1L);

        long validLefPts = 0;
        long res = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                validLefPts += mp.getOrDefault(cumSum, 0L);
                cumSum += 1;
            }
            else
            {
                cumSum -= 1;
                validLefPts -= mp.getOrDefault(cumSum, 0L);
            }

            mp.put(cumSum, mp.getOrDefault(cumSum, 0L)+1);
            res += validLefPts;
        }

        return res;
        
    }
}
