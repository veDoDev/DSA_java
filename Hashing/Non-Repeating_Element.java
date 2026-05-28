class Solution {
    public int firstNonRepeating(int[] arr) 
    {
        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int x : arr)
            freq.put(x, freq.getOrDefault(x, 0)+1);
            
        for(int x : arr)
            if(freq.get(x) == 1)
                return x;
        return 0;
    }
}
