//-------------------------------------------------------------------------------------Approach 1 - (Recursion)---(2 ms)------------------------------------------------------------------------------------------------------
class Solution {
    public String getHappyString(int n, int k) 
    {
        if(3*(1<<(n-1)) < k) // 3* (1 << n-1) == 3* 2^(n-1) ----> this is the total numbers of combinations
            return "";
            
        ArrayList<String> happy = new ArrayList<>();
        putAllHappy(happy, new StringBuilder(), -1, n, k);

        return happy.get(k-1);
    }

    public void putAllHappy(ArrayList<String> happy, StringBuilder currStr, int alpha, int n, int targetLen)
    {
        if(happy.size() == targetLen)
            return;

        if(n == 0)
        {
            happy.add(currStr.toString());
            return;
        }

        if(alpha == -1)
        {
            for(char x = 'a'; x <= 'c'; x++)
            {
                currStr.append(x);
                putAllHappy(happy, currStr, x - 'a', n-1, targetLen);
                currStr.deleteCharAt(currStr.length() - 1);
            }
        }
        else
        {
            for (int i = 0; i < 3; i++) 
            {
                if (i == alpha) continue;
                currStr.append((char)('a' + i));
                putAllHappy(happy, currStr, i, n - 1, targetLen);
                currStr.deleteCharAt(currStr.length() - 1);
            }
        }
    }
}

//-------------------------------------------------------------------------------------Approach 2 - (DFS)---(1 ms)-------------------------------------------------------------------------------------------------------
class Solution {
    public String getHappyString(int n, int k) 
    {
        if (3 * (1 << (n - 1)) < k)
            return "";

        k--;
        StringBuilder res = new StringBuilder();
        char prev = 0;

        for (int i = 0; i < n; i++) 
        {
            int subTreeLen = 1 << (n - 1 - i); 

            for (char c = 'a'; c <= 'c'; c++) 
            {
                if (c == prev) continue;

                if (k < subTreeLen) 
                {
                    res.append(c);
                    prev = c;
                    break;
                }
                k -= subTreeLen;
            }
        }

        return res.toString();
    }
}
