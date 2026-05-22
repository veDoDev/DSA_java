// User function Template for Java

class Solution {
    // Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][]) {
        // code here// User function Template for Java
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++)
        {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m-1];
            matrix[i][m-1] = temp;
        }
        
    }
}
