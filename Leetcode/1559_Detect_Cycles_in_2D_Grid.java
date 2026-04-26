class Solution {
    public boolean containsCycle(char[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        List<Character> impossibleNodes = new ArrayList<>();
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(visited[i][j])
                    continue;
                    
                visited[i][j] = true;

                if(makesLoop(grid, n, m, i, j, visited, -1, -1))
                    return true;
            }
        }

        return false;
    }

    public boolean makesLoop(char[][] grid, int n, int m, int i, int j, boolean[][] visited, int I, int J)
    {
        // DFS Up
        if(i-1 >= 0 && 
           grid[i-1][j] == grid[i][j] && 
           i-1 != I)
        {
            if(visited[i-1][j])
                return true;
            
            visited[i-1][j] = true;
            if(makesLoop(grid, n, m, i-1, j, visited, i, j))
                return true;
        }

        //DFS Right
        if(j+1 < m &&
           grid[i][j+1] == grid[i][j] &&
           j+1 != J)
        {
            if(visited[i][j+1])
                return true;

            visited[i][j+1] = true;
            if(makesLoop(grid, n, m, i, j+1, visited, i, j))
                return true;
        }

        //DFS Down
        if(i+1 < n &&
           grid[i+1][j] == grid[i][j] && 
           i+1 != I)
        {
            if(visited[i+1][j])
                return true;

            visited[i+1][j] = true;
            if(makesLoop(grid, n, m, i+1, j, visited, i, j))
                return true;
        }

        //DFS Left
        if(j-1 >= 0 &&
           grid[i][j-1] == grid[i][j] &&
           j-1 != J)
        {
            if(visited[i][j-1])
                return true;

            visited[i][j-1] = true;
            if(makesLoop(grid, n, m, i, j-1, visited, i, j))
                return true;
        }

        return false;
    }
}
