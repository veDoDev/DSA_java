class Solution {
    int floorSqrt(int n) 
    {
        int left = 0;
        int right = n;
        
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            
            if(mid*mid == n)
                return mid;
            else if(mid*mid < n)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return (int)Math.sqrt(n);
    }
}
