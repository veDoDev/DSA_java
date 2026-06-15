class Solution {
    public boolean isIsomorphic(String s1, String s2) 
    {
        int n = s1.length();
        
        int[] charMap1 = new int[256];
        int[] charMap2 = new int[256];
            
        for(int i = 0; i < n; i++)
        {
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            
            if(charMap1[c1] == 0)
                charMap1[c1] = c2+1;
            else if(charMap1[c1] != c2+1)
                return false;
                
            if(charMap2[c2] == 0)
                charMap2[c2] = c1+1;
            else if(charMap2[c2] != c1+1)
                return false;
        }
        
        return true;
        // code here
        
    }
}
