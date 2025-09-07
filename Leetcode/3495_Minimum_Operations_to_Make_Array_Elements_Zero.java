class Solution {
    static{
        for(int i = 0; i < 1000; i++)
        {
            minOperations(new int[0][0]);
        }
    }
    public static long minOperations(int[][] queries) 
    {
        long res = 0;
        for (int[] q : queries) 
        {
            long totalSteps = steps(q[1]) - steps(q[0] - 1);
            res += (totalSteps + 1) / 2;
        }
        return res;
    }

    private static long steps(long n) 
    {
        if (n <= 0) return 0;
        long sum = 0;
        long base = 1;
        int level = 1;

        while (base <= n) 
        {
            long next = base * 4 - 1;
            long high = Math.min(n, next);
            sum += (high - base + 1) * level;
            base *= 4;
            level++;
        }
        return sum;
    }
}
