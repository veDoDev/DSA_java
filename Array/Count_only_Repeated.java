class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) 
    {
        int n = arr.length;
        
        int freq = 1, ele = -1;
        
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                ele = arr[i];
                while(i < n-1 && arr[i] == arr[i+1])
                {
                    freq++;
                    i++;
                }
                    
                return new ArrayList<Integer>(Arrays.asList(ele, freq));
            }
        }
        return new ArrayList<Integer>(Arrays.asList(-1, -1));
    }
}
