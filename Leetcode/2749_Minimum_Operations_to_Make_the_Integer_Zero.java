class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) 
        {
            long x = (long)num1 - (long)k * num2;
            if (x < 0) break;
            if (Long.bitCount(x) <= k && k <= x)
                return k;
        }
        return -1;
    }
}
