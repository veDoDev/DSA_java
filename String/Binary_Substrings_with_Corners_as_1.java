class Solution {
    public int binarySubstring(String s) 
    {
        int count = 0;
        int oneCnt = 0;
        for(char x : s.toCharArray())
            if(x == '1')
                count += oneCnt++;
                
        return count;
    }
}
