class Solution {
    public void reverseString(char[] s)
    {
        int upperLim = s.length-1;
        for(int lowerLim = 0; lowerLim < s.length/2; lowerLim++)
        {
            char temp  =s[lowerLim];
            s[lowerLim] = s[upperLim];
            s[upperLim] = temp;
            upperLim--;
        }
        return;
    }
}
