class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        //pass 1 : count row sums and col sums, and store them
        int n = mat.length;
        int m = mat[0].length;
        
        int[] rowSum = new int[n],
              colSum = new int[m];
              
        int maxSum = 0;
              
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
                
                if(i == n-1)
                    maxSum = Math.max(maxSum, colSum[j]);
            }
            
            maxSum = Math.max(maxSum, rowSum[i]);
        }
        
        int moves = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int addFact = maxSum - Math.max(rowSum[i], colSum[j]);
                
                moves += addFact;
                mat[i][j] += addFact;
                rowSum[i] += addFact;
                colSum[j] += addFact;
            }
        }
        
        return moves;
    }
}
