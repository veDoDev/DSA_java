class Solution {
    public int countSubarray(int[] arr) 
    {
        int n = arr.length;
        int prefix = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int x : arr)
        {
            prefix = prefix + ((x == 1) ? (1) : (-1));
            
            if(map.containsKey(prefix))
                count += map.get(prefix);
                
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        
        return count;
    }
}
