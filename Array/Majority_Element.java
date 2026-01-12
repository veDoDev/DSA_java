class Solution {
    int majorityElement(int arr[]) 
    {
        int n = arr.length;
        int lim = n/2;
        
        int count = 0,num = -1, candidate = -1;
        
        for(int i = 0; i < n; i++)
        {
            if(count == 0)
            {
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate)
                count++;
            else
                count--;
        }
        
        
        count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == candidate)
                count++;
        }
        
        
        return (count > lim)?(candidate):(-1);
    }
}
