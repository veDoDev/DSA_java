class Solution {
    public int longestBalanced(String s) 
    {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            int[] chars = new int[26];

            int distinct = 0;
            int threshFreq = 0;

            for(int j = i; j < n; j++)
            {
                int idx = s.charAt(j) - 'a';

                chars[idx]++;

                if(chars[idx] == 1)
                    distinct++;

                threshFreq = Math.max(chars[idx], threshFreq);

                if(threshFreq*distinct == (j-i + 1))
                    ans = Math.max(ans, j-i+1);
            }
        }

        return ans;
    }
}
