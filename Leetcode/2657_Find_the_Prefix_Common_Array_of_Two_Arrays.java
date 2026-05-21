class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int n = A.length;

        int[] counter = new int[n+1];
        int[] res = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            counter[A[i]]++;
            counter[B[i]]++;

            count += (counter[A[i]] - 1);
            if(A[i] != B[i])
                count += (counter[B[i]] - 1);

            res[i] = count;
        }

        return res;       
    }
}
