class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        // word counters
        int n = word1.length;
        int m = word2.length;
        int w1Cnt = 0;
        int w2Cnt = 0;

        // char counters
        int c1Cnt = 0; 
        int c2Cnt = 0;
        int c1Lim = word1[w1Cnt].length();
        int c2Lim = word2[w2Cnt].length();

        while(w1Cnt < n && w2Cnt < m)
        {
            while(c1Cnt < c1Lim && c2Cnt < c2Lim)
            {
                if(word1[w1Cnt].charAt(c1Cnt) != word2[w2Cnt].charAt(c2Cnt))
                    return false;
                
                c1Cnt++;
                c2Cnt++;
            }
            if(c1Cnt == c1Lim)
            {
                w1Cnt++;
                c1Cnt = 0;
                if(w1Cnt < n)
                    c1Lim = word1[w1Cnt].length();
            }
            if(c2Cnt == c2Lim)
            {
                w2Cnt++;
                c2Cnt = 0;
                if(w2Cnt < m)
                    c2Lim = word2[w2Cnt].length();
            }
        }

        return w1Cnt == n && w2Cnt == m;
    }
}
