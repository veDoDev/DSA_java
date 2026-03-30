//----------------------------------------------------------------------------------Approach 1 : Use sorting (Naive)-----------------------------------------------------------------------------------------------------------
class Solution {
    public boolean checkStrings(String s1, String s2) 
    {
        int n = s1.length();
        int eveLen = (n%2 == 0) ? (n/2) : (n/2 + 1);
        int oddLen = n/2;

        char[] eveS1 = new char[eveLen];
        char[] oddS1 = new char[oddLen];
        char[] eveS2 = new char[eveLen];
        char[] oddS2 = new char[oddLen];

        for(int i = 0; i < n; i++)
        {
            int idx = i/2;
            if(i%2 == 0)
            {
                eveS1[idx] = s1.charAt(i);
                eveS2[idx] = s2.charAt(i);
            }
            else
            {
                oddS1[idx] = s1.charAt(i);
                oddS2[idx] = s2.charAt(i);
            }
        }

        Arrays.sort(eveS1);
        Arrays.sort(eveS2);
        Arrays.sort(oddS1);
        Arrays.sort(oddS2);

        return Arrays.equals(eveS1, eveS2) && Arrays.equals(oddS1, oddS2);
    }
}
//************************************************Memory: 47.8MB || Beats : 7.89% ************************************Runtime: 17ms || Beats : 17.11% **************************************************************************
