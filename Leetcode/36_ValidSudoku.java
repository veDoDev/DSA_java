//------------------------------------------------------------------------------------Naive Solution (First thought)------------------------------------------------

// class Solution {
//     public boolean isValidSudoku(char[][] board) 
//     {
//         HashMap<Character, List<String>> coordMap = new HashMap<>();

//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 char curr = board[i][j];

//                 if (curr == '.') continue;

//                 int box = (i / 3) * 3 + (j / 3);  // Flatten box index
//                 String loc = i + "," + j + "," + box;

//                 if (coordMap.containsKey(curr)) {
//                     for (String s : coordMap.get(curr)) {
//                         String[] parts = s.split(",");
//                         int row = Integer.parseInt(parts[0]);
//                         int col = Integer.parseInt(parts[1]);
//                         int b = Integer.parseInt(parts[2]);

//                         if (row == i || col == j || b == box) return false;
//                     }
//                 }

//                 coordMap.putIfAbsent(curr, new ArrayList<>());
//                 coordMap.get(curr).add(loc);
//             }
//         }

//         return true;
//     }
// }

//------------------TC : O(n) --------------|-----------------SC : θ(1)--------------------|------------Beats : 26.84% in time--------------|-------------Beats : 24.83% in memory-----------------

//---------------------------------------------------------------------------------------------- 2. Optimized --------------------------------------------------------------------------------------

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
//------------------TC : θ(1) --------------|-----------------SC : θ(1)--------------------|------------Beats : 78.81% in time--------------|-------------Beats : 95.30% in memory-----------------
