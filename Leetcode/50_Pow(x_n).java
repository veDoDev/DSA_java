class Solution {
    public double myPow(double x, int n) 
    {
        long exp = n;
        if(exp < 0)
        {
            x = 1/x;
            exp = -1*exp;
        }

        return calcPow(x, exp);
    }

    public double calcPow(double base, long n)
    {
        if(n == 0)
            return 1;
        if(n == 1)
            return base;
        return calcPow(base*base, n/2)*calcPow(base, n%2);
    }
}
