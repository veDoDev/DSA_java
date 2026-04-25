class Solution {
    public int evenSumSubgraphs(int[] nums, int[][] edges) 
    {
        int n = nums.length;

        List<Integer>[] g = new ArrayList[n];
        for(int i = 0; i < n; i++)
            g[i] = new ArrayList<>();

        for(int[] e : edges)
        {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        int ans = 0;

        for(int msk = 1; msk < (1 << n); msk++)
        {
            int sum = 0;
            for(int i = 0; i < n; i++)
                if((msk & (1 << i)) != 0)
                    sum += nums[i];

            if(sum % 2 == 1)
                continue;

            if(isConn(msk, g, n))
                ans++;
        }

        return ans;        
    }

    private boolean isConn(int mask, List<Integer>[] g, int n)
    {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        // node
        for(int i = 0; i < n; i++)
        {
            if((mask & (1 << i)) != 0)
            {
                q.add(i);
                vis[i] = true;
                break;
            }
        }

        // bfs
        while(!q.isEmpty())
        {
            int u = q.poll();
            for(int x : g[u])
            {
                if(!vis[x] && ((mask & (1 << x)) != 0))
                {
                    vis[x] = true;
                    q.add(x);
                }
            }
        }

        for(int i = 0; i < n; i++)
            if((mask & (1 << i)) != 0 && !vis[i])
                return false;


        return true;
    }
}
