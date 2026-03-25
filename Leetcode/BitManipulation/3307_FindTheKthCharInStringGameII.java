class Solution {
    public char kthCharacter(long k, int[] operations) 
    {
        int m = operations.length;
        long[] len = new long[m + 1];
        len[0] = 1;                         // "a"

        // 1. build length array
        for (int i = 0; i < m; i++) 
        {
            len[i + 1] = Math.min(len[i] << 1, k);   // cap at k to avoid overflow
        }

        long pos = k;               // 1‑based
        int shift = 0;              // net +1 shifts (mod 26)

        // 2. rewind
        for (int i = m - 1; i >= 0; i--) 
        {
            long half = len[i];
            if (pos > half) 
            {       // in the right half
                pos -= half;        // map to left half
                if (operations[i] == 1) 
                {
                    shift = (shift + 1) % 26;
                }
            }
            // if pos ≤ half, we stay in left half – nothing else to do
        }

        // 3. original string is "a"
        return (char) ('a' + shift);
    }
}
