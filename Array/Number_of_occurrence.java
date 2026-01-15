//-------------------------------------------------------------------------------------------------__Approach 1__-------------------------------------------------------------------------------------------------------------
class Solution {
    int countFreq(int[] arr, int target) 
    {
        int n = arr.length;
        
        int lowL = 0, lowU = 0;
        int highL = n-1, highU = n-1;
        int res1 = -1, res0 = -1;
        
        while(lowL <= highL || lowU <= highU)
        {
            int mid = lowL + (highL - lowL)/2;
            if(lowL <= highL)
            {
                if(arr[mid] == target)
                {
                    if(mid == 0 || arr[mid] != arr[mid - 1])
                    {
                        res0 = mid;
                        lowL = highL + 1;
                    }
                    else
                        highL = mid - 1;
                    
                }
                else if(arr[mid] > target)
                    highL = mid - 1;
                else
                    lowL = mid + 1;
            }
            
            if(lowU <= highU)
            {
                mid = lowU + (highU - lowU)/2;
                
                if(arr[mid] == target)
                {
                    if(mid == n-1 || arr[mid] != arr[mid + 1])
                    {
                        res1 = mid;
                        lowU = highU + 1;
                    }
                    else
                        lowU = mid + 1;
                }
                else if(arr[mid] > target)
                    highU = mid - 1;
                else
                    lowU = mid + 1;
            }
            
            // System.out.println(res0 + " " + res1);
        }
        
        if(res0 == -1)
            return 0;
        
        return (res1 - res0 + 1);
        
    }
}

//-------------------------------------------------------------------------------------------------__Approach 2__-------------------------------------------------------------------------------------------------------------
class Solution {
    int countFreq(int[] arr, int target) 
    { 
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0;

        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    private int firstOccurrence(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1;
        int res = -1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) 
            {
                res = mid;
                high = mid - 1;   // move left
            } 
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return res;
    }

    private int lastOccurrence(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1;
        int res = -1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) 
            {
                res = mid;
                low = mid + 1;   // move right
            } 
            else if (arr[mid] < target)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return res;
    }
}
