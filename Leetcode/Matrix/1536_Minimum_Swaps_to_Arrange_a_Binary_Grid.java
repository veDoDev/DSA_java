class Solution {
    public int minSwaps(int[][] grid) 
    {
        int n = grid.length;
        int[] maxRight = new int[n];
        int swaps = 0;


        for (int i = 0; i < n; i++) 
        {
            int count = 0;
            for (int j = n - 1; j >= 0 && grid[i][j] == 0; j--)
                count++;
            
            maxRight[i] = count;
        }

        for (int i = 0; i < n; i++) 
        {
            int needed = n - 1 - i;
            int j = i;

            while (j < n && maxRight[j] < needed) 
                j++;
            

            if (j == n) 
                return -1;  
            
            while (j > i) 
            {
                int temp = maxRight[j];
                maxRight[j] = maxRight[j - 1];
                maxRight[j - 1] = temp;
                j--;
                swaps++;
            }
        }

        return swaps;
    }
}
