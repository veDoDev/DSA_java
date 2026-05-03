class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) 
    {
        int n = mat.length;
        int m = mat[0].length;
        
        int i = 0;
        int j = 0;
        
        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;
        int upperWall = 0;
        int lowerWall = n;
        int leftWall = 0;
        int rightWall = m;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(mat[0][0]);
        
        while(i < n && j < m)
        {
            //Right
            if(j+1 < rightWall && !(vis[i][j+1]))
            {
                j++;
                while(j < rightWall)
                {
                    res.add(mat[i][j]);
                    vis[i][j] = true;
                    j++;
                }
                upperWall++;
                j--;
            }
            //Down
            else if(i+1 < lowerWall && !(vis[i+1][j]))
            {
                i++;
                while(i < lowerWall)
                {
                    res.add(mat[i][j]);
                    vis[i][j] = true;
                    i++;
                }
                rightWall--;
                i--;
            }
            //left
            else if(j > leftWall && !(vis[i][j-1]))
            {
                j--;
                while(j >= leftWall)
                {
                    res.add(mat[i][j]);
                    vis[i][j] = true;
                    j--;
                }
                lowerWall--;
                j++;
            }
            //Up
            else if(i > upperWall  && !(vis[i-1][j]))
            {
                i--;
                while(i >= upperWall)
                {
                    res.add(mat[i][j]);
                    vis[i][j] = true;
                    i--;
                }
                leftWall++;
                i++;
            }
            else
                break;
        }
        
        return res;
    }
}
