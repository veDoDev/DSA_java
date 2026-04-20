//---------------------------------------------------------------------------------Approach 1 - Sliding window-------------------------------------------------------------------------------------------------------------------
class Solution {
    public int maxDistance(int[] colors) 
    {
        //sliding window?
        int n = colors.length;
        int winLen = n-1;

        while(winLen > 0)
        {
            int tail = 0;
            int head = winLen;
            while(head < n)
            {
                if(colors[head] != colors[tail])
                    return winLen;

                tail++;
                head++;
            }

            winLen--;
        }

        return 0; //unreachable, since a valid pair is guaranteed in contraints !        
    }
}

//---------------------------------------------------------------------------------Approach 2 - Optimal -----------------------------------------------------------------------------------------------------------------------
class Solution {
    public int maxDistance(int[] colors) 
    {
        int n = colors.length;

        for(int winLen = n-1; winLen > 0; winLen--)
        {
            // from idx = 0;
            if(colors[0] != colors[winLen])
                return winLen;

            // from idx = n-1
            if(colors[n-1-winLen] != colors[n-1])
                return winLen;
        }

        return -1;
    }
}
