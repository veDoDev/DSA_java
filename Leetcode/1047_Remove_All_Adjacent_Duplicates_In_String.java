class Solution {
    public String removeDuplicates(String s) 
    {
        int n = s.length();
        char[] st = new char[n];
        int top = -1;

        for(char x : s.toCharArray())
        {
            char peek = top == -1 ? '#' : st[top];

            if(peek == x)
                top--;
            else
                st[++top] = x;
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i <= top; i++)
        {
            char x = st[i];
            if(x == ' ')
                continue;
            
            res.append(x);
        }

        return res.toString();
    }
}
