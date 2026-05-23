class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(mat[i][j] == 1)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(rows[i] || cols[j])
                    mat[i][j] = 1;
            }
        }
    }
}
