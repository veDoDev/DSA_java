class Solution
{
    int mulFact = 29;
    long MOD = 2147483647;

    public int repeatedStringMatch(String a, String b)
    {
        StringBuilder superStr = new StringBuilder();
        int m = b.length();
        int iter = 0;
        int aL = a.length();

        while(superStr.length() < m)
        {
            superStr.append(a);
            iter++;
        }

        int n = superStr.length();

        //creating the hash of b
        long bHash = 0;
        for(char x : b.toCharArray())
            bHash = ((bHash + (x-'a'))*mulFact)%MOD;

        long aHash = 0;
        long subFact = 1;

        //build the window
        for(int i = 0; i < m; i++)
        {
            char x = superStr.charAt(i);
            aHash = ((aHash + (x-'a'))*mulFact)%MOD;
            subFact = (subFact*mulFact) % MOD;
        }

        int tail = 0;
        int head = m-1;
        boolean alreadyAppendedOnce = false;

        while(true)
        {
            while(head < n)
            {
                if(aHash == bHash && comp(superStr, b, tail, head))
                    return iter;
                else
                {
                    if(head+1 == n)
                        break;

                    long subEle = ((superStr.charAt(tail)-'a')*subFact)%MOD;

                    head++;
                    aHash = (((aHash - subEle) + (superStr.charAt(head) - 'a') + MOD) * mulFact) % MOD;

                    tail++;
                }
            }
            if(alreadyAppendedOnce)
                break;
            superStr.append(a);
            iter++;
            n += aL;
            alreadyAppendedOnce = true;
        }

        return -1;
    }

    private boolean comp(StringBuilder parent, String pat, int start, int end)
    {
        StringBuilder res = new StringBuilder();

        for(int i = start; i <= end; i++)
            res.append(parent.charAt(i));

        return pat.equals(res.toString());
    }
}
