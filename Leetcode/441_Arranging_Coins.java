//--------------------------------------------------------------------------------------------Approach 1 : Binary Search---------------------------------------------------------------------------------------------------
class Solution {
    public int arrangeCoins(int n) 
    {
        long low = 1;
        long high = n;

        while(low <= high)
        {
            long mid = low + (high - low)/2;
            long coinsReq = (mid* (mid+1))/2;

            if(coinsReq < n)
                low = mid + 1;
            else if(coinsReq == n)
                return (int)mid;
            else if(coinsReq - n < mid)
                return (int)mid-1;
            else
                high = mid -1;
        }

        return (int)low;        
    }
}

//--------------------------------------------------------------------------------------------Approach 2 : Quadratic Formula---------------------------------------------------------------------------------------------------
