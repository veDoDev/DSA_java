class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int n = word.length();
        int count = 0;

        int[] lower = new int[26];
        int[] upper = new int[26];

        for(int i = 0; i < 26; i++)
        {
            lower[i] = -1;
            upper[i] = -1;
        }

        for(int i = 0; i < n; i++)
        {
            char x = word.charAt(i);
            if(x <= 'z' && x >= 'a')
                lower[x-'a'] = i;
            else if(upper[x-'A'] == -1)
                upper[x-'A'] = i;
        }

        for(int i = 0; i < 26; i++)
            if((lower[i] != -1 && upper[i] != -1) && lower[i] < upper[i])
                count++;

        return count;       
    }
}
