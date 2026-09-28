class Solution {
    public int maxDepth(String s) 
    {
        int nest = 0;
        int deepest = 0;

        for(char x : s.toCharArray())
        {
            if(x == '(')
                nest++;
            else if(x == ')')
                nest--;

            deepest = Math.max(deepest, nest);            
        }

        return deepest;        
    }
}
