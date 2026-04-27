class Solution {
    public String removeStars(String s) 
    {
        int n = s.length();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '*')
                res.deleteCharAt(res.length()-1);
            else
                res.append(s.charAt(i));
        }
        
        return res.toString();
    }
}
