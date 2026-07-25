class Solution {
    public int maxProduct(int n) 
    {
        // int res = 1;
        int currD = -1;
        int prevD = -1;

        while(n > 0)
        {
            int d = n%10;
            if(d >= currD)
            {
                prevD = currD;
                currD = d;
            }
            else if(d > prevD)
                prevD = d;

            n = n/10;
        }

        return currD*prevD;
    }
}
