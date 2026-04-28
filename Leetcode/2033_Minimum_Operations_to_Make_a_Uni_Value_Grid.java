class Solution {
    public int minOperations(int[][] grid, int x) 
    {
        int n = grid.length,
            m = grid[0].length;

        int[] sortThis = new int[m*n];
        int idx = 0;

        int rem = grid[0][0] % x;

        for(int[] row : grid)
        {
            for(int val : row)
            {
                if((val % x) != rem)
                    return -1;

                sortThis[idx++] = val;
            }
        }

        Arrays.sort(sortThis);
        int median = sortThis[sortThis.length/2];
        int count = 0;

        for(int val : sortThis)
            count += Math.abs(val - median)/x;

        return count;       
    }
}
