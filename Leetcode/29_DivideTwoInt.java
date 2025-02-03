class Solution {
    public int divide(int dividend, int divisor)
    {
        if (dividend == 0)  return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int negFlag = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);
        
        int quotient = 0;
        while (lDividend >= lDivisor)
        {
            long temp = lDivisor, multiple = 1;
            while (lDividend >= (temp << 1))
            {
                temp <<= 1;
                multiple <<= 1;
            }
            lDividend -= temp;
            quotient += multiple;
        }

        return quotient * negFlag;
    }
}
