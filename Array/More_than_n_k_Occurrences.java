class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) 
    {
        int n = arr.length;
        int lim =  n/k, count = 0;
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            
            if(freqMap.get(arr[i]) == lim+1)
                count++;
            
        }
        
        return count;
    }
}
