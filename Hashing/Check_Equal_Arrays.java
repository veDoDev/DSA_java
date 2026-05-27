class Solution {
    public static boolean checkEqual(int[] a, int[] b) 
    {
        int n = a.length;
        int m = b.length;
        
        if(n != m)
            return false;
            
        HashMap<Integer, Integer> aMap = new HashMap<>();
        HashMap<Integer, Integer> bMap = new HashMap<>();
        
        for(int i = 0 ;i < n; i++)
        {
            aMap.put(a[i], aMap.getOrDefault(a[i], 0) + 1);
            bMap.put(b[i], bMap.getOrDefault(b[i], 0) + 1);
        }
        
        for(int i = 0; i < n; i++)
        {
            int bCnt = bMap.get(b[i]);
            
            if(bCnt != aMap.getOrDefault(b[i], -1))
                return false;
        }
        
        return true;
    }
}
