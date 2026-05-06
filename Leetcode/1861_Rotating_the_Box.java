class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) 
    {
        int n = boxGrid.length;      // rows
        int m = boxGrid[0].length;   // cols

        // Step 1: Rotate matrix (90° clockwise)
        char[][] rotBox = new char[m][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rotBox[j][n - 1 - i] = boxGrid[i][j];

        // Step 2: Apply gravity (downwards in rotated box)
        for (int col = 0; col < n; col++) 
        {
            int empty = m - 1; // bottom-most empty position

            for (int row = m - 1; row >= 0; row--) 
            {
                if (rotBox[row][col] == '*')
                    empty = row - 1; // reset above obstacle

                else if (rotBox[row][col] == '#') 
                {
                    // move stone down
                    rotBox[row][col] = '.';
                    rotBox[empty][col] = '#';
                    empty--;
                }
            }
        }

        return rotBox;
    }
}
