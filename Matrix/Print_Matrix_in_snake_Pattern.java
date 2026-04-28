// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) 
    {
        int n = matrix.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int idx;
                if(i % 2 == 0)
                    idx = j;
                else
                    idx = n - j - 1;
                    
                res.add(matrix[i][idx]);
            }
        }
        
        return res;
    }
}
