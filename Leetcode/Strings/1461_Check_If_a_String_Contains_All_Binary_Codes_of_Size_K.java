class Solution {
    public boolean hasAllCodes(String s, int k) 
    {
        int n = s.length();
        int currNum = 0;
        int mask = (1<<k)-1;
        int freq = 1;

        if(n < k)
            return false;

        boolean[] allNums = new boolean[1<<k];
        // Set<Integer> allNums = new HashSet<>();

        for(int i = 0; i < k; i++)
            currNum = (currNum << 1) | (s.charAt(i)- '0');

        allNums[currNum] = true;

        for(int head = k; head < n; head++)
        {               
            currNum = ((currNum << 1) | (s.charAt(head) - '0')) & mask;
            if(allNums[currNum] == false)
                freq++;
            allNums[currNum] = true;
        }

        return (freq == (1<<k));
    }
}
