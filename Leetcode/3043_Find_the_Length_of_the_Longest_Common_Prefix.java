class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashSet<Integer> prefsO1 = new HashSet<>();

        for(int x : arr1)
        {
            while(x > 0)
            {
                prefsO1.add(x);
                x /= 10;
            }
        }

        int maxL = 0;

        for(int x : arr2)
        {
            int totLen = (int)Math.log10(x) + 1;
            while(x > 0)
            {
                if(prefsO1.contains(x))
                {
                    maxL = Math.max(maxL, totLen);
                    break;
                }
                x /= 10;
                totLen--;
            }
        }

        return maxL;
    }
}
