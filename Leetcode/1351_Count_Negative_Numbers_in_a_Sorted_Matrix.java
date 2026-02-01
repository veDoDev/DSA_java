class Solution {
    public int countNegatives(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        int negCount = 0;

        for(int i = 0; i < n; i++)
        {
            int low = 0;
            int high = m-1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;
                // System.out.println(low + " " + mid + " " + high);

                if(grid[i][mid] < 0)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            negCount += m - low;
            // System.out.println("" + negCount);
        }

        return negCount;
    }
}
