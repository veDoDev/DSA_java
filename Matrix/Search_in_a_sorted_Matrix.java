class Solution {
    public boolean searchMatrix(int[][] mat, int x) 
    {
        int n = mat.length;
        int m = mat[0].length;
        
        int high = m*n-1;
        int low = 0;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            int i = mid/m;
            int j = mid%m;
            
            if(mat[i][j] < x)
                low = mid + 1;
            else if(mat[i][j] > x)
                high = mid - 1;
            else
                return true;
        }
        
        return false;
        // code here
        
    }
}
