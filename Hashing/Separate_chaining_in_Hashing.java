class Solution {
    public ArrayList<ArrayList<Integer>> separateChaining(int hashSize, int[] arr) 
    {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(hashSize);
        
        for(int i = 0; i < hashSize; i++)
            res.add(i, new ArrayList<Integer>());
        
        for(int x : arr)
        {
            int mod = x%hashSize;
            res.get(mod).add(x);
        }
        
        return res;
    }
}
