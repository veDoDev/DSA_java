class Solution {
    public boolean validMountainArray(int[] arr) 
    {
        
        int n = arr.length, foundPeak = 0;

        if((n < 3) || (arr[0] > arr[1]) || (arr[n-1] > arr[n-2]))   return false;

        for(int i = 1; i < n-1; i++)
        {
            if(arr[i] == arr[i-1])  return false;
            // if( (arr[i] < arr[i+1]) && (arr[i] < arr[i-1]) )    return false;
            if( (arr[i-1] < arr[i]) && (arr[i] > arr[i+1]) )
            {
                foundPeak++;
                if(foundPeak >= 2)  return false;
            }
        }
        
        if(foundPeak == 1)
            return true;
        return false;
    }
}
