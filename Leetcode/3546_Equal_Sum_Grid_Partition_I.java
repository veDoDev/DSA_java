class Solution {
    public boolean canPartitionGrid(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;

        int[] rowSum = new int[n];
        int[] colSum = new int[m];
        long totalSum = 0;

        for(int i = 0; i < n; i++)
        {
            for(int u = 0; u < m; u++)
            {
                colSum[u] += grid[i][u];
                rowSum[i] += grid[i][u];
                totalSum += grid[i][u];
            }
        }

        if(totalSum % 2 == 1)
            return false;

        long currSum = 0;
        //check cols
        for(int i = 0; i < m; i++)
        {
            currSum += colSum[i];
            if(currSum == (totalSum - currSum))
                return true;
        }

        currSum = 0;
        //check rows
        for(int i = 0; i < n; i++)
        {
            currSum += rowSum[i];
            if(currSum == (totalSum - currSum))
                return true;
        }

        return false;
    }
}
