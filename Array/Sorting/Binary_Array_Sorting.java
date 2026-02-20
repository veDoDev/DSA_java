class Solution {
    public void binSort(int[] arr) 
    {
        int n = arr.length;
        int zeroPtr = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 0)
                swap(arr, i, zeroPtr++);
        }
    }
    
    public void swap(int[] arr, int x, int y)
    {
        arr[x] ^= 1;
        arr[y] ^= 1;
    }
}
