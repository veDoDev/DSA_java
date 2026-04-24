class Solution {
    public int furthestDistanceFromOrigin(String moves) 
    {
        int lCnt = 0,
            rCnt = 0,
            uCnt = 0;

        for(char x : moves.toCharArray())
        {
            if(x == 'L') lCnt++;
            else if(x == '_') uCnt++;
            else    rCnt++;
        }

        return Math.abs(lCnt - rCnt) + (uCnt);
    }
}
