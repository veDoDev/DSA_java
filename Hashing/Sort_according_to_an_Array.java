class Solution {
    static void relativeSort(int[] a1, int[] a2) 
    {
        int n = a1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a2.length; i++)
            if(!map.containsKey(a2[i]))
                map.put(a2[i], i);
            
        Integer[] a1Cpy = new Integer[n];
        for(int i = 0; i < n; i++)
            a1Cpy[i] = a1[i];
            
        Arrays.sort(a1Cpy, (a,b) -> {
            if(map.containsKey(a) && map.containsKey(b))
                return map.get(a) - map.get(b);
            else if(map.containsKey(a))
                return -1;
            else if(map.containsKey(b))
                return 1;
            else
                return a-b;
        });
        
        for(int i = 0; i < n; i++)
            a1[i] = a1Cpy[i];
        
        // code here
        
    }
}
