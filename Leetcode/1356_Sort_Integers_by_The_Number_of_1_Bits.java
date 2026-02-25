class Solution {
    public int[] sortByBits(int[] arr) 
    {
        int n = arr.length;
        Integer[] res = new Integer[n];

        for(int i = 0; i < n; i++)
            res[i] = arr[i];
        
        Arrays.sort(res, (a, b) -> {
            int bitCompare = Integer.bitCount(a) - Integer.bitCount(b);
            
            if (bitCompare != 0)
                return bitCompare;

            return a - b;
        });

        for(int i = 0; i < n; i++)
            arr[i] = res[i];
        
        return arr;
    }
}
