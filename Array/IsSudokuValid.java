class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        // Initialize sets
        for (int i = 0; i < 9; i++) 
        {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse board
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                char curr = board[i][j];
                if (curr == '.') continue;

                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(curr) || cols[j].contains(curr) || boxes[boxIndex].contains(curr))
                    return false;

                rows[i].add(curr);
                cols[j].add(curr);
                boxes[boxIndex].add(curr);
            }
        }

        return true;
    }
}
