class Solution {
    public String reverseWords(String s) 
    {
        int n = s.length();
        ArrayList<String> words = new ArrayList<>();
        
        int i = 0;
        while(i < n)
        {
            StringBuilder word = new StringBuilder();
            while(i < n && s.charAt(i) == '.')
                i++;
                
            while(i < n && s.charAt(i) != '.')
                word.append(s.charAt(i++));
            
            if(word.length() != 0)
            words.add(word.toString());
        }
        
        StringBuilder res = new StringBuilder();
        int m = words.size();
        for(i = m-1; i >= 0; i--)
        {
            String word = words.get(i);
            for(char x : word.toCharArray())
                res.append(x);
            if(i != 0)
                res.append('.');
        }
        
        return res.toString();
    }
}
