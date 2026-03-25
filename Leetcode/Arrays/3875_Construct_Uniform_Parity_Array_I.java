class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        int n = nums1.length;

        int evenCnt = 0, oddCnt = 0;

        for(int i = 0; i < n; i++)
        {
            if(nums1[i] % 2 == 0)
                evenCnt++;
            else
                oddCnt++;
        }

        return (evenCnt >= 1 &&  oddCnt >= 1) || (evenCnt == 0) || (oddCnt == 0);       
    }
}
