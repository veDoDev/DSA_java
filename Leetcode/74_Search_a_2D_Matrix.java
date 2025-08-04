class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rows = matrix.length, cols = matrix[0].length;

        // Binary search to find the correct row
        int row = findRow(matrix, target);

        if (row == -1) return false; 

        // Binary search within that row
        int low = 0, high = cols - 1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public int findRow(int[][] matrix, int target) 
    {
        int low = 0, high = matrix.length - 1;
        int cols = matrix[0].length;

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][cols - 1])
                return mid;
            else if (target < matrix[mid][0])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
