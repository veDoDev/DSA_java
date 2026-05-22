class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) 
    {
        int n = mat.length;
        int upperSum = 0;
        int lowerSum = 0;
        
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n; j++)
            {
                if(i <= j)
                    lowerSum += mat[i][j];
                if(j <= i)
                    upperSum += mat[i][j];
            }
        }
        
        return new ArrayList<>(List.of(lowerSum, upperSum));
    }
}
