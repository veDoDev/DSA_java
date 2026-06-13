class Solution {
    public boolean areRotations(String s1, String s2) 
    {
        if(s2.length() != s1.length())
            return false;
        s2 = s2 + s2;
        int n = s2.length();
        int m = s1.length();
        int[] lps = new int[m];
        lps[0] = 0;
        int j = 0;
        int i = 1;
        
        while(i < m)
        {
            if(s1.charAt(j) == s1.charAt(i))
            {
                j++;
                lps[i] = j;
                i++;
            }
            else if(j == 0)
            {
                lps[i] = 0;
                i++;
            }
            else
                j = lps[j-1];
        }
        
        j = 0;
        i = 0;
        
        while(i < n)
        {
            if(j == m)
                return true;
            if(s1.charAt(j) == s2.charAt(i))
            {
                i++;
                j++;
            }
            else if(j != 0)
                j = lps[j-1];
            else
                i++;
        }
        
        return false;
    }
}
