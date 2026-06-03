class Solution {
    public List<Integer> posNegPair(int[] arr) 
    {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int x : arr)
            freqMap.put(x, freqMap.getOrDefault(x, 0)+1);
            
        for(int curr : arr)
        {
            int comp = -curr;
            
            if(freqMap.getOrDefault(comp, 0) > 0 && freqMap.getOrDefault(curr, 0) > 0)
            {
                if(curr == 0)
                    continue;
                res.add(curr);
                res.add(comp);
                freqMap.put(comp, freqMap.get(comp)-1);
                freqMap.put(curr, freqMap.get(curr)-1);
            }
        }
        
        return res;
    }
}  
