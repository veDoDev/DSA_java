class Solution {
    public int mySqrt(int x) 
    {
        if (x < 2) return x;

        int low = 1;
        int high = x / 2;
        int ans = 0;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid)  // mid*mid <= x (safe)
            {  
                ans = mid;          // mid is a valid candidate
                low = mid + 1;      // try to find a bigger one
            } 
            else
                high = mid - 1;     // mid is too large
        }

        return ans;
    }
}
