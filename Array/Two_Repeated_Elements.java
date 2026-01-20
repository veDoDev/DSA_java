class Solution {
    public int[] twoRepeated(int[] arr) 
    {
        int n = arr.length;
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int idx = 0;
        
        for(int i = 0; i < n; i++)
        {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            
            if(freqMap.get(arr[i]) > 1)
            {
                res[idx] = arr[i];
                idx++;
            }
            
            if(idx == 2)
                break;
        }
        
        return res;
        
    }
}
