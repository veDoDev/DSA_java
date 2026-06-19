class Solution {
    public int repeatedCharacter(String S) 
    {
        int n = S.length();
        HashMap<Character, Integer> idxMap = new HashMap<>();
        int minIdx = Integer.MAX_VALUE;
        boolean found = false;
        
        for(int i = 0; i < n; i++)
        {
            char c = S.charAt(i);
            if(idxMap.containsKey(c))
            {
                minIdx = Math.min(minIdx, idxMap.get(c));
                found = true;
            }
            else
                idxMap.put(c,i);
        }
        
        return (found) ? (minIdx) : (-1);
    }
}
