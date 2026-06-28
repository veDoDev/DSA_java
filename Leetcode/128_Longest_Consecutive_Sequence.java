class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int n = nums.length;
        HashSet<Integer> uniq = new HashSet<>();

        for(int x : nums)
            uniq.add(x);

        int maxSeq = 0;
        for(int x : uniq)
        {
            if(uniq.contains(x-1))
                continue;

            int curr = x;
            int currSeq = 0;

            while(uniq.contains(curr))
            {
                currSeq++;
                curr++;
            }

            maxSeq = Math.max(maxSeq, currSeq);
        }

        return maxSeq;
    }
}
