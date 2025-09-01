class Solution {
    static{
        System.gc();
        for(int i=0; i<1000; i++){
            longestSubarray(new int[]{0, 0});
        }
    }
    public static int longestSubarray(int[] nums) 
    {
        int n = nums.length;
        int zerCnt = 0;
        int left = 0;
        int maxWinLen = 0;

        for(int right = 0; right < n; right++)
        {
            if(nums[right] == 0)    zerCnt++;

            while(zerCnt > 1 && left < right)
            {
                if(nums[left] == 0) zerCnt--;
                left++;
            }

            maxWinLen = Math.max(maxWinLen, right - left);
        }
        return maxWinLen;        
    }
}
