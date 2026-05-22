class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m/2; j++)
            {
                int comp = m-1-j;
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][comp];
                matrix[i][comp] = temp;
            }
        }
        // code here
        
    }
}
