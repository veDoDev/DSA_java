class Solution {
    public boolean validDigit(int n, int x) 
    {
        boolean flag = false;
        while(n > 0)
        {
            int currDig = n % 10;
            if(currDig == x)
            {
                flag = true;
                if(n < 10)
                    return false;
            }

            n /= 10;
        }

        return flag;
    }
}
