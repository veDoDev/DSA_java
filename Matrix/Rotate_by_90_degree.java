class Solution {
    public void rotateMatrix(int[][] mat) 
    {
        int n = mat.length;
        int temp = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                temp = mat[i][j];
                
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
                
            }
        }
        
        for(int i = 0; i < n/2; i++)
        {
            for(int j = 0; j < n; j++)
            {
                temp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-1-i][j] = temp;
            }
        }
    }
    
}   
