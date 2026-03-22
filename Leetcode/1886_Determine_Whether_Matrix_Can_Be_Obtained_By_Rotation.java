class Solution {
    public boolean findRotation(int[][] mat, int[][] target) 
    {
        int n = mat.length;
        int[] coord = new int[2];
        boolean found;

        for(int i = 0; i < 4; i++)
        {
            found = true;
            for(int x = 0; x < n; x++)
            {
                for(int y = 0; y < n; y++)
                {
                    coord = transformCoordinates(x, y, i, n);
                    if(mat[x][y] != target[coord[0]][coord[1]])
                    {
                        found = false;
                        break;
                    }

                }

                if(!found)
                    break;
            }

            if(found)
                return true;
        }

        return false;
    }

    public int[] transformCoordinates(int x, int y, int iter, int n)
    {
        int[] res = new int[2];

        for(int i = 0; i < iter; i++)
        {
            int temp = x;
            x = y;
            y = n - 1 - temp;
        }

        res[0] = x;
        res[1] = y;

        return res;
    }
}
