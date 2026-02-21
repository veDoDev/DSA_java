class Solution {
    public int minPlatform(int arr[], int dep[]) 
    {
        int n = arr.length;
        int currPf = 0;
        int maxPf = Integer.MIN_VALUE;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int aT = 0, dT = 0;
        
        while(aT < n && dT < n)
        {
            if(arr[aT] <= dep[dT])
            {
                aT++;
                currPf++;
                maxPf = Math.max(maxPf, currPf);
            }
            else
            {
                currPf--;
                dT++;
            }
        }
        
        return maxPf;
    }
}
