class Solution {
    public char getMaxOccuringChar(String s) 
    {
        int[] map = new int[26];
        
        for(char x: s.toCharArray())
            map[x-'a']++;
        
        int maxFreq = 0;
        char c = '_';
        for(int i = 0; i < 26; i++)
        {
            if(map[i] > maxFreq)
            {
                maxFreq = map[i];
                c = (char)('a' + i);
            }            
        }
                
        return c;
    }
}
