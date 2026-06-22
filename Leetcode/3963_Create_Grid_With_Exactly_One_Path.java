class Solution {
    public String[] createGrid(int m, int n) 
    {
        String[] res = new String[m];
        StringBuilder curr = new StringBuilder();
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || j == n-1)
                    curr.append('.');
                else
                    curr.append('#');
            }
            res[i] = curr.toString();
            curr.setLength(0);
        }

        return res;
    }
}
