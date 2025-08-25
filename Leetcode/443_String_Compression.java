class Solution {
    public int compress(char[] chars) 
    {
        int n = chars.length;
        int res = 0;
        int currCount = 0;
        char currChar;
        String strNum;
        int i = 0;
        while(i < n)
        {
            currCount = 0;
            currChar = chars[i];
            while((i<n) && (currChar == chars[i]))
            {
                currCount++;
                i++;
            }

            chars[res++] = currChar;
            if(currCount > 1)
            {
                strNum = Integer.toString(currCount);
                for(int j = 0; j < strNum.length(); j++)
                {
                    chars[res++] = strNum.charAt(j);
                }
            }
            
        }
        return res;
    }
}
