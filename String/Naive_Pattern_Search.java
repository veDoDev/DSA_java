class Solution {
    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) 
    {
        int idx = 0;
        int n = pat.length();
        int m = txt.length();
        
        for(int i = 0; i < m; i++)
        {
            if(txt.charAt(i) == pat.charAt(idx))
            {
                while(i < m && idx < n && txt.charAt(i) == pat.charAt(idx))
                {
                    idx++;
                    i++;
                }
                    
                if(idx == n)
                    return true;
                idx = 0;
            }
        }
        
        return false;
    }
}
