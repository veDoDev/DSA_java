class Solution {
    public int findSum(String s) 
    {
        int n = s.length();
        int sum = 0;
        int currNum = 0;
        
        for(int i = 0; i < n; i++)
        {
            int currChar = s.charAt(i);
            if(currChar >= 48 && currChar <= 57)
                currNum = (currNum * 10) + (currChar - 48);
            else
            {
                sum += currNum;
                currNum = 0;
            }
            
        }
        
        return sum + currNum;
    }
}
