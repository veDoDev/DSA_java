class Solution {
    public String removeDuplicateLetters(String s) 
    {
        int n = s.length();

        int[] last = new int[26];
        boolean[] selected = new boolean[26];

        for (int i = 0; i < n; i++)
            last[s.charAt(i) - 'a'] = i;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) 
        {
            char c = s.charAt(i);

            if (selected[c - 'a'])
                continue;

            while (!st.empty() &&
                   st.peek() > c &&
                   last[st.peek() - 'a'] > i)
                   
                selected[st.pop() - 'a'] = false;

            st.push(c);
            selected[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!st.empty())
            ans.append(st.pop());

        return ans.reverse().toString();
    }
}
