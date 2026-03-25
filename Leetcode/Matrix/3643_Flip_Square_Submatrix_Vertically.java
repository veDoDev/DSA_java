class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) 
    {
        int currX = x;
        int cmplX = x + (k - 1);

        while(currX < cmplX)
        {
            for(int j = 0; j < k; j++)
            {
                int currY = (y + j);
                int temp = grid[currX][currY];
                grid[currX][currY] = grid[cmplX][currY];
                grid[cmplX][currY] = temp;           
            }
            cmplX--;
            currX++;
        }

        return grid;        
    }
}
