class Solution {
    public int numberOfSpecialChars(String word) 
    {
        int n = word.length();
        int count = 0;

        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];

        for(char x : word.toCharArray())
        {
            if( Character.isLowerCase(x))
            {
                count += (upper[x - 'a'] && !lower[x - 'a']) ? (1) : (0);

                lower[x-'a'] = true;        
            }
            else if(Character.isUpperCase(x))
            {
                count += (lower[x - 'A'] && !upper[x - 'A']) ? (1) : (0);
                
                upper[x-'A'] =  true;
            }
        }

        return count;       
    }
}
