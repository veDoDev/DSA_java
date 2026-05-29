class Solution {
    public static int firstRepeated(int[] arr) 
    {
        int n = arr.length;
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int x : arr)
            freqMap.put(x, freqMap.getOrDefault(x, 0)+1);
            
        for(int i = 0; i < n; i++)
            if(freqMap.get(arr[i]) > 1)
                return i+1;
                
                
        return -1;
        // code here
        
    }
}
