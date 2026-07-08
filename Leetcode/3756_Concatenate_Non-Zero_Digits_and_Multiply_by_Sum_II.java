class Solution
{
    private static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries)
    {
        int n = s.length();

        long[] sum = new long[n];
        long[] x = new long[n];
        long[] tens = new long[n + 1];
        int[] cnt = new int[n];

        int first = s.charAt(0) - '0';

        tens[0] = 1;
        x[0] = first;
        sum[0] = first;
        cnt[0] = (first != 0) ? 1 : 0;

        for(int i = 1; i < n; i++)
        {
            int d = s.charAt(i) - '0';

            if(d == 0)
            {
                x[i] = x[i - 1];
                sum[i] = sum[i - 1];
                cnt[i] = cnt[i - 1];
            }
            else
            {
                x[i] = (x[i - 1] * 10 + d) % MOD;
                sum[i] = sum[i - 1] + d;
                cnt[i] = cnt[i - 1] + 1;
            }

            // tens[i] = 10^i (mod MOD)
            tens[i] = (tens[i - 1] * 10) % MOD;
        }

        int[] res = new int[queries.length];

        for(int i = 0; i < queries.length; i++)
        {
            int l = queries[i][0] - 1;
            int r = queries[i][1];

            long currSum;
            long num;

            if(l == -1)
            {
                currSum = sum[r];
                num = x[r];
            }
            else
            {
                currSum = sum[r] - sum[l];

                long numLeft = x[l];
                long numRight = x[r];
                int len = cnt[r] - cnt[l];

                num = (numRight - numLeft * tens[len] % MOD + MOD) % MOD;
            }

            res[i] = (int)((currSum % MOD) * (num % MOD) % MOD);
        }

        return res;
    }
}
