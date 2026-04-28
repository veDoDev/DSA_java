class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) 
    {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        
        if(n == 1)
            for(int i = 0; i < m; i++)
                res.add(mat[0][i]);
        else if(m == 1)
            for(int i = 0; i < n; i++)
                res.add(mat[i][0]);
        else
        {
            // chhat
            for(int i = 0; i < m; i++)
                res.add(mat[0][i]);
            //right
            for(int i = 1; i < n; i++)
                res.add(mat[i][m-1]);
            //zameen
            for(int i = m-2; i >= 0; i--)
                res.add(mat[n-1][i]);
            //left
            for(int i = n-2; i > 0; i--)
                res.add(mat[i][0]);
        }
        
        return res;
    }
}
