class Solution {
    private final int MAX_POSSIBLE_LENGTH = 11;
    // Under nums[i] <= 1e9, the longest possible chain starts at 2:
    // 2 -> 4 -> 16 -> 256 -> 65536 -> 4294967296 (>1e9)
    // Therefore the maximum valid subset length is 11.

    public int maximumLength(int[] nums) 
    {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for(int x : nums)
        {
            freqMap.put(x, freqMap.getOrDefault(x, 0)+1);
            maxNum = Math.max(maxNum, x);
            minNum = Math.min(minNum, x);
        }

        int maxSetLen = 1;
        int maxExp = 0;
        int oneFreq = freqMap.getOrDefault(1,0);

        if(oneFreq != 0)
        {
            maxSetLen = (oneFreq%2 == 0) ? (oneFreq-1) : (oneFreq);
            maxExp = maxSetLen/2 + 1;
        }

        if(maxSetLen >= MAX_POSSIBLE_LENGTH) 
            return maxSetLen;


        for(int i = Math.max(2, minNum); Math.pow(i, maxExp+1) <= maxNum; i++)
        {
            int freq = freqMap.getOrDefault(i, 0);
            int currSetLen = 0;
            long currNum = i;

            if(freq == 0)
                continue;

            while(freq >= 2)
            {
                currSetLen++;
                currNum = currNum*currNum;
                freq = freqMap.getOrDefault((int)currNum, 0);
            }

            currSetLen = (currSetLen*2) + (freq == 1 ? 1 : -1);
            maxSetLen = Math.max(maxSetLen, currSetLen);
            maxExp = (maxSetLen/2) + 1;
        }

        return maxSetLen;
    }
}
