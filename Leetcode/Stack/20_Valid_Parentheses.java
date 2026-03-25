class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> res = new Stack<>();
        char top;
        
        for(char i : s.toCharArray())
        {
            if(( i == '(') || ( i == '{') || ( i == '['))
                res.push(i);
            else
            {
                if (res.isEmpty()) return false;
                top = res.pop();
                
                if (((top == '(') && (i != ')')) || 
                    ((top == '[') && (i != ']')) ||
                    ((top == '{') && (i != '}')))
                    return false;
            }
        }

        return (res.size() == 0);
    }
}
