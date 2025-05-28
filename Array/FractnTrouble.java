// User function Template for Java

class Solution {
    public int[] LargestFraction(int n, int d) 
    {
        int bestNr = 0, bestDr = 1;
        
        for(int Dr = 10000; Dr >= 1; Dr--)
        {
            int tempNr = (n*Dr)/d;
            
            if((long)tempNr*d >= (long)n*Dr)
                tempNr--;
            
            if(tempNr >= 0 && gcd(tempNr, Dr) == 1)
            {
                if((long) bestDr*tempNr > (long)bestNr*Dr)
                {
                    bestNr = tempNr;
                    bestDr = Dr;
                }

            }
        }
        
        return new int[]{bestNr, bestDr};
    }
    
    public int gcd(int num1, int num2)
    {
        while(num2 != 0)
        {
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
}
