//----------------------------------------------------------------------------------------------Approach 1: Beats 14% in time------------------------------------------------------------------------------------------------
class Solution {
    public int strStr(String txt, String pat) 
    {
        int n = txt.length();
        int m = pat.length();

        if (m == 0) return 0;
        if (m > n) return -1;

        int[] lps = new int[m];
        fillLPS(pat, lps);

        int patPtr = 0;
        int txtPtr = 0;

        while(txtPtr < n)
        {
            if(pat.charAt(patPtr) == txt.charAt(txtPtr))
            {
                patPtr++;
                txtPtr++;
                if(patPtr == m)
                    return txtPtr-patPtr;
            }
            else
            {
                if(patPtr == 0)
                    txtPtr++;
                else
                    patPtr = lps[patPtr-1];
            }
        }
        // code here
        return -1;
        
    }

    private void fillLPS(String s, int[] lps)
    {
        int n = s.length();
        int i = 1;
        int len = 0;
        lps[0] = 0;
        
        while(i < n)
        {
            if(s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if(len == 0)
                {
                    lps[i] = 0;
                    i++;
                }
                else
                    len = lps[len-1];
            }
        }

        return;
    }
}

//----------------------------------------------------------------------------------------------Approach 2: Beats 100% in time------------------------------------------------------------------------------------------------
class Solution {
    public int strStr(String haystack, String needle) 
    {
        int n = haystack.length();
        int m = needle.length();

        if(m > n)
            return -1;

        int i = 0;
        
        while(i <= n-m)
        {
            if(needle.equals(haystack.substring(i, i+m)))
                return i;

            i++;
        }

        return -1;
    }
}
