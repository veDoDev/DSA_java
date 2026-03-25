class Solution {
    public int minOperations(String s) 
    {
        int n = s.length();
        int altCnt = 0;

        // count with starting at 1
        for(int i = 0; i < n; i++)
        {
            char expected = (i % 2 == 0 ? '0' : '1');
            if (s.charAt(i) != expected)
                    altCnt++;
        }

        return Math.min(altCnt, n - altCnt); 
    }
}
