class Solution {
    public String removeOuterParentheses(String s) 
    {
        StringBuilder res = new StringBuilder();
        int depth = 0;

        for(char i : s.toCharArray())
        {
            if(i == '(')    
            {
                if(depth != 0)   
                    res.append(i);

                depth++;
            }
            else
            {
                if(depth != 1)
                    res.append(i);

                depth--;
            }
        }

        return res.toString();
        
    }
}
