class Solution {
    // Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n) 
    {
        if(n == 1)
            return mat[0][0];
        if(n == 2)
            return (mat[0][0]*mat[1][1]) - (mat[0][1]*mat[1][0]);
            
        int[][] subMtrx = new int[n][n];
        int mulFact;
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            mulFact = (i%2 == 0)?(1):(-1);
            
            getSubMtrx(mat, subMtrx, i, n);
            
            total += mulFact*mat[0][i]*determinantOfMatrix(subMtrx, n-1);
        }
        
        return total;
    }
    
    static void getSubMtrx(int[][] matrix, int subMtrx[][], int col, int n)
    {
        int xIdx = 0;
        int yIdx = 0;
        for(int i = 1; i < n; i++)
        {
            yIdx = 0;
            for(int j = 0; j < n; j++)
            {
                if(j == col)
                    continue;
                
                subMtrx[xIdx][yIdx++] = matrix[i][j];
            }
            
            xIdx++;
        }
    }
}
