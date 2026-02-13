class Solution {
    static boolean searchInSorted(int arr[], int k) 
    {
        int n = arr.length;
        return searchKaro(arr, k, 0, n-1);
    }
    
    public static boolean searchKaro(int[] arr, int x, int start, int end)
    {
        int newIdx = start + (end-start)/2;
        
        if(start > end)
            return false;
        
        if(arr[newIdx] == x)
            return true;
        else if(arr[newIdx] < x)
            return searchKaro(arr, x, newIdx+1, end);
        else
            return searchKaro(arr, x, start, newIdx-1);
    }
}
