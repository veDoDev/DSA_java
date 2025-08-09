class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int newFlowers = 0,len = flowerbed.length;
        
        if(n == 0)  return true;

        if(len == 1)
        {
            newFlowers = (flowerbed[0] == 0) ? 1 : 0;
            return (newFlowers >= n);
        }

        //first element
        if((flowerbed[0] | flowerbed[1]) == 0)
        {
            newFlowers = 1;
            flowerbed[0] = 1;
        } 

        //loop
        for(int i = 1; i < len-1; i++)
        {
            if(flowerbed[i] == 1)   continue;
            if((flowerbed[i-1] | flowerbed[i+1]) == 0)
            {
                flowerbed[i] = 1;
                newFlowers++;
            }
            if(newFlowers >= n) return true;
        }


        //last element
        if((flowerbed[len - 2] | flowerbed[len - 1]) == 0)
            newFlowers++;


        return (newFlowers >= n);
    }
}
