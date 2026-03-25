// User function Template for Java

class Solution {
    // Function to add two matrices.
    static int[][] Addition(int A[][], int B[][]) 
    {
        int n1 = A.length;
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n1; j++)
            {
                A[i][j] += B[i][j];
            }
        }
        
        return A;
    }
}
