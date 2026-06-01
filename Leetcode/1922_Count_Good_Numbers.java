class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) 
    {
        long res = 1;

        long even = (long)Math.ceil(n/2.0);
        long odd = n - even;
        long combinations = (power(5L, even)*power(4L,odd))%MOD;
        
        return (int)(combinations % 1000000007);
    }

    private long power(long base, long pow)
    {
        if(base > MOD)
            base = base%MOD;
        
        if(pow == 1)
            return base;
        else if(pow == 0)
            return 1;
        else if((pow & 1) == 0)
            return power(base*base, pow/2L);
        else
            return (base*power(base*base, pow/2L))%MOD;

    }
}
