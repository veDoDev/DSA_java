class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();
        
        int i = n - 1;
        
        while (i >= 0) 
        {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            
            word.setLength(0);
            while (i >= 0 && s.charAt(i) != ' ') 
            {
                word.append(s.charAt(i));
                i--;
            }
            
            res.append(word.reverse());
            
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i >= 0) res.append(' ');
        }
        
        return res.toString();
    }
}
