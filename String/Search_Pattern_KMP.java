class Solution {
    ArrayList<Integer> search(String pat, String txt) 
    {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        
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
                {
                    res.add(txtPtr-m);
                    patPtr = lps[patPtr-1];
                }
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
        return res;
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
                {
                    len = lps[len-1];
                }
            }
        }
    }
}
