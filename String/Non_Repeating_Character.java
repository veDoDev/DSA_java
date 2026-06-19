class Solution {
    public char nonRepeatingChar(String s) 
    {
        int[] freq = new int[26];
        int n = s.length();
        
        for(char x : s.toCharArray())
            freq[x-'a']++;
            
        for(char x : s.toCharArray())
            if(freq[x-'a'] == 1)
                return x;
                
        return '$';
    }
}
