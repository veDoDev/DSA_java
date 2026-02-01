//-------------------------------------------------------------------------------------------------Approach 1 ------------------------------------------------------------------------------------------------------------
class Solution {
    public void mergeArrays(int a[], int b[]) 
    {
        int n = a.length;
        int m = b.length;
        int aPtr = n-1;
        int bPtr = 0;
        
        while(aPtr >= 0 && bPtr < m && a[aPtr] > b[bPtr])
        {
            swap(a, b, aPtr, bPtr);
            aPtr--;
            bPtr++;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
    
    public void swap(int[] a, int[] b, int n, int m)
    {
        int temp = a[n];
        a[n] = b[m];
        b[m] = temp;
    }
}



//-----------------------------------------------------------------Gap Method----------------------------Approach 2 -----------------------------------------------------------------------------------------
class Solution {
    public void mergeArrays(int a[], int b[]) 
    {
        int n = a.length;
        int m = b.length;
        int len = m+n;
        int gap = (len) / 2 + (len)%2;
        
        while(gap > 0)
        {
            int left = 0;
            int right = left + gap;
            while(right < len)
            {
                if(left < n && right >= n)
                    swap(a, b, left, right-n);
                else if(left >= n)
                    swap(b, b, left - n, right - n);
                else
                    swap(a, a, left, right);
                    
                left++;
                right++;
            }
            if(gap == 1)
                break;
            
            gap = gap/2 + (gap%2);
        }
    }
    
    public void swap(int[] a, int[] b, int n, int m)
    {
        if(a[n] <= b[m])
            return;
            
        int temp = a[n];
        a[n] = b[m];
        b[m] = temp;
    }
}

