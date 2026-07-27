class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
        int idx = s.size()/2;
        
        bichWaleKoNikal(s, idx);
    }
    
    private void bichWaleKoNikal(Stack<Integer> st, int idx)
    {
        if(idx == 0)
        {
            st.pop();
            return;
        }
        
        int curr = st.pop();
        bichWaleKoNikal(st, idx-1);
        st.push(curr);
    }
}
