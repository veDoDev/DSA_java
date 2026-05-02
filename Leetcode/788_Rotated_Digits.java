class Solution 
{
    boolean[] valid = new boolean[10000];

    public int rotatedDigits(int n) 
    {
        int cnt = 0;
        for(int i = 0 ; i <= n; i++)
        {
            if(valid[i])
                cnt++;
            else if(isGood(i))
            {
                valid[i] = true;
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isGood(int x)
    {
        int valCnt = 0;
        while(x > 0)
        {
            int dig = x%10;
            if(dig == 2 || dig == 5 || dig == 6 || dig == 9)
                valCnt++;
            else if(dig == 3 || dig == 4 || dig == 7)
                return false;

            x /= 10;
        }

        return (valCnt > 0);
    }
}
