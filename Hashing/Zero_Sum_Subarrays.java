class Solution {
    public int findSubarray(int[] arr) 
    {
        int n = arr.length;
        int totSum = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        set.put(0, 1);
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            totSum += arr[i];
            if(set.containsKey(totSum))
                count+=set.get(totSum);
                
            set.put(totSum, set.getOrDefault(totSum, 0)+1);
        }
        
        return count;
    }
}
