class Solution {
    public long sumAndMultiply(int n) 
    {
        long tens = 1;
        long sum = 0;
        long x = 0;

        while(n > 0)
        {
            int d = n%10;
            n /= 10;

            if(d == 0)
                continue;
                
            x = 1L*d*tens + x;
            tens *= 10;
            sum += d;
        }

        return x*sum;
    }
}
