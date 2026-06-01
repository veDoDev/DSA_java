class Solution {
    public int minimumCost(int[] cost) 
    {
        sortDescending(cost);

        int sum = 0;

        for (int i = 0; i < cost.length; i++)
            if ((i + 1) % 3 != 0) // every 3rd candy is free
                sum += cost[i];

        return sum;
    }

    private void sortDescending(int[] arr) 
    {
        int[] freq = new int[101];

        for (int x : arr)
            freq[x]++;

        int ptr = 0;

        for (int i = 100; i >= 1; i--) 
            while (freq[i]-- > 0) 
                arr[ptr++] = i;
    }
}
