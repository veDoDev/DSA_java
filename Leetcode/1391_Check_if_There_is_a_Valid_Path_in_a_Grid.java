class Solution {
    int[][][] dirs = {
        {},
        {{0,-1},{0,1}},   // 1
        {{-1,0},{1,0}},   // 2
        {{0,-1},{1,0}},   // 3
        {{0,1},{1,0}},    // 4
        {{0,-1},{-1,0}},  // 5
        {{0,1},{-1,0}}    // 6
    };

    public boolean hasValidPath(int[][] grid) 
    {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        return dfs(grid, 0, 0, visited);
    }

    private boolean dfs(int[][] grid, int i, int j, boolean[][] visited) 
    {
        int n = grid.length, m = grid[0].length;

        if (i == n - 1 && j == m - 1) return true;

        visited[i][j] = true;

        for (int[] d : dirs[grid[i][j]]) 
        {
            int ni = i + d[0], nj = j + d[1];

            if (ni < 0 || nj < 0 || ni >= n || nj >= m || visited[ni][nj])
                continue;

            // check reverse connection
            if (canConnect(grid[ni][nj], -d[0], -d[1])) 
                if (dfs(grid, ni, nj, visited)) return true;
            
        }

        return false;
    }

    private boolean canConnect(int type, int dx, int dy) 
    {
        for (int[] d : dirs[type])
            if (d[0] == dx && d[1] == dy) return true;
        
        return false;
    }
}
