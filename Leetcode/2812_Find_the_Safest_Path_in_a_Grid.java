class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) 
    {
        //find all thieves
        // run BFS from all thieves
        //binary search from max value to min Value,
        // maximiize this

        int n = grid.size();
        Queue<Integer> thieves = new LinkedList<>(); //thieves[i]/n == row, thieves[i]%n == col
        int[][]  d = new int[n][n];
        for(int i = 0; i < n; i++)
            Arrays.fill(d[i], Integer.MAX_VALUE);

        findAllThieves(grid, thieves, d);

        findMinDistFromAll(thieves, grid, d);

        int low = 0;
        int high = 2*(n-1);

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            boolean[][] vis = new boolean[n][n];
            vis[0][0] = true;
            boolean pathWithMid = (d[0][0] >= mid) ? isPathPossibleAt(mid, d, vis) : false;

            if(pathWithMid)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return high;
    }

    private void findAllThieves(List<List<Integer>> grid, Queue<Integer> chor, int[][] d)
    {
        int n = grid.size();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid.get(i).get(j) == 1)
                {
                    chor.add((n*i) + j);
                    d[i][j] = 0;
                }
            }
        }
            
    }

    private void findMinDistFromAll(Queue<Integer> chor, List<List<Integer>> grid, int[][] dist)
    {
        int n = grid.size();

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while(!chor.isEmpty())
        {
            int x = chor.poll();

            int row = x/n;
            int col = x%n;

            //explore neighbours
            for(int k = 0; k < 4; k++)
            {
                int nr = row + dr[k];
                int nc = col + dc[k];

                if(nr < 0 || nc < 0 || nr >= n || nc >= n)
                    continue;

                if(dist[nr][nc] > dist[row][col] + 1)
                {
                    dist[nr][nc] = dist[row][col]+1;
                    chor.offer(nr*n + nc);
                }
            }
        }
    }

    private boolean isPathPossibleAt(int val, int[][] d, boolean[][] vis)
    {
        int n = d.length;
        if(n == 1)
            return true;

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty())
        {
            int k = q.poll();

            int x = k/n;
            int y = k%n;

            for(int i = 0; i < 4; i++)
            {
                int r = x + dr[i];
                int c = y + dc[i];

                if(r >= n || r < 0 || c >= n || c < 0 || vis[r][c])
                    continue;

                
                if(d[r][c] >= val)
                {
                    vis[r][c] = true;
                    if(r == n-1 && c == n-1)
                        return true;
                    q.offer(r*n + c);
                }
            }
        }
        

        return false;
    }

    
}
