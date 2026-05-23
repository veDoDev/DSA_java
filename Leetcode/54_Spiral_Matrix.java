class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) 
        {
            // left -> right
            for (int j = left; j <= right; j++) 
                spiral.add(matrix[top][j]);

            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) 
                spiral.add(matrix[i][right]);
        
            right--;

            // right -> left
            if (top <= bottom) 
            {
                for (int j = right; j >= left; j--) 
                    spiral.add(matrix[bottom][j]);
                
                bottom--;
            }

            // bottom -> top
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                    spiral.add(matrix[i][left]);
                
                left++;
            }
        }

        return spiral;
    }
}
