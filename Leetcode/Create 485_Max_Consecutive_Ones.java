class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n = nums.length;
        int oneCnt = 0;
        int maxCnt = 0;
        for(int i = 0; i < n; i++)
        {
            oneCnt = 0;
            while(i < n && nums[i] == 1)
            {
                oneCnt++;
                i++;
            }

            maxCnt = Math.max(maxCnt, oneCnt);
        }

        return maxCnt;
    }
}
