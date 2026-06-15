class Solution {
    public static boolean areAnagrams(String s1, String s2) 
    {
        int[] sign = new int[26];
        
        for(char x : s1.toCharArray())
            sign[x-'a']++;
        for(char x : s2.toCharArray())
            sign[x-'a']--;
        
        for(int i = 0; i < 26; i++)
            if(sign[i] != 0)
                return false;
                
        return true;
    }
}
