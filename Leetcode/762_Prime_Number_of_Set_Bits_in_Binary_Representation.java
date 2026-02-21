class Solution 
{
    boolean[] isPrime = {
    false,  // 0
    false,  // 1
    true,   // 2
    true,   // 3
    false,  // 4
    true,   // 5
    false,  // 6
    true,   // 7
    false,  // 8
    false,  // 9
    false,  // 10
    true,   // 11
    false,  // 12
    true,   // 13
    false,  // 14
    false,  // 15
    false,  // 16
    true,   // 17
    false,  // 18
    true,    // 19
    false    // 20
    };
    public int countPrimeSetBits(int left, int right) 
    {
        int primeCnt = 0;
        for(int i = left; i <= right; i++)
        {
            int setBits = Integer.bitCount(i);

            if(isPrime[setBits])
                primeCnt++;
        }

        return primeCnt;
    }

    public int bitCnt(int x)
    {
        int count = 0;

        while(x != 0)
        {
            x = x & (x-1);
            count++;
        }

        return count;
    }
}
