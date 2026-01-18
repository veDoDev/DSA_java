class Solution {
    public double medianOf2(int arr[], int brr[]) 
    {
        
        int n = arr.length, m = brr.length;
        if(n > m)
            return medianOf2(brr, arr);
            
        int total = n+m;
        int leftSize = (total + 1)/2;
        
        int low = 0, high = n;
        
        while(low <= high)
        {
            int midA = low + (high - low)/2;
            int midB = leftSize - midA;
            
            int aLeftMax = (midA == 0) ? (Integer.MIN_VALUE) : (arr[midA-1]);
            int aRightMin = (midA == n) ? (Integer.MAX_VALUE) : (arr[midA]);
            
            int bLeftMax = (midB == 0) ? (Integer.MIN_VALUE) : (brr[midB-1]);
            int bRightMin = (midB == m) ? (Integer.MAX_VALUE) : (brr[midB]);
            
            if(aLeftMax <= bRightMin && bLeftMax <= aRightMin)
            {
                double x = Math.max(bLeftMax, aLeftMax);
                if(total%2 == 0)
                {
                    double y = Math.min(aRightMin, bRightMin);
                    
                    return (x + y)/2;
                }
                return x;
            }
            else if(bLeftMax > aRightMin)
                low = midA + 1;
            else
                high = midA - 1;
        }
        
        return 0;
        // Code Here
        
    }
}
