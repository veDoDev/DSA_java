class Solution {
    public int minFlips(String s) 
    {
        int n = s.length();
        int typ2Cnt = 0;

        StringBuilder ds = new StringBuilder(s + "" + s);
        int diff1 = 0; //starts with 0
        int diff2 = 0; // starts with 1
        int head = 0, tail = 0;
        int res = n;

        //build the window
        while(head < n)
        {
            int actual = ds.charAt(head) - '0';
            int expected = head%2; //for diff1

            diff1 += actual ^ expected;
            diff2 += actual ^ (1 - expected); 
            head++;
        }

        res = Math.min(diff1, diff2);

        if(n%2 == 0)
            return res;

        for(tail = 1; tail < n; tail++)
        {
            
            int rem = tail - 1;
            //-----handling tail------
            int actual = ds.charAt(rem) - '0';
            int expected = rem%2; //for diff1

            diff1 -= actual ^ expected;
            diff2 -= actual ^ (1 - expected);

            //-----handling head------
            actual = ds.charAt(head) - '0';
            expected = head%2; //for diff1

            diff1 += actual ^ expected;
            diff2 += actual ^ (1 - expected);
            head++;

            res = Math.min(Math.min(res, diff1), diff2);
        }


        return res;
    }
}
