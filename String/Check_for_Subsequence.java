class Solution {
    public boolean isSubSeq(String s1, String s2) 
    {
        int n = s1.length();
        int m = s2.length();
        int s1Ptr = 0;
        
        for(char x : s2.toCharArray())
        {
            if(s1.charAt(s1Ptr) == x)
            {
                s1Ptr++;
                if(s1Ptr >= n)
                    return true;
            }
        }
        
        return false;
    }
};
