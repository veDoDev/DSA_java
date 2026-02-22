class Solution {
    public static String countSort(String s) 
    {
        int[] alphabets = new int[26];
        
        for(char x : s.toCharArray())
            alphabets[x - 'a']++;
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < 26; i++)
            for(int j = 0; j < alphabets[i]; j++)
                res.append((char)(i + 'a'));
        
        return res.toString();
    }
}
