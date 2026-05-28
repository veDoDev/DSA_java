class Solution {
    public int countNonRepeated(int arr[]) 
    {
       int n = arr.length;
       
       HashMap<Integer, Integer> freqMap = new HashMap<>();
       
        for(int x : arr)
            freqMap.put(x, freqMap.getOrDefault(x, 0)+1);
            
        int count = 0;
           
        for(Map.Entry<Integer, Integer> x : freqMap.entrySet())
        {
            if(x.getValue() == 1)
                count++;
        }
        
        return count;
    }
}
