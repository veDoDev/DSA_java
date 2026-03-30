//----------------------------------------------------------------------------------Approach 3 : Array of all characters for freq---------------------------------------------------------------------------------------------
class Solution {
    public boolean checkStrings(String s1, String s2) 
    {
        int n = s1.length();
        int eveLen = (n%2 == 0) ? (n/2) : (n/2 + 1);
        int oddLen = n/2;

        int[] eveS1 = new int[26];
        int[] oddS1 = new int[26];
        int[] eveS2 = new int[26];
        int[] oddS2 = new int[26];

        for(int i = 0; i < n; i++)
        {
            int idx1 = s1.charAt(i) - 'a';
            int idx2 = s2.charAt(i) - 'a';
            if(i%2 == 0)
            {
                eveS1[idx1]++;
                eveS2[idx2]++;
            }
            else
            {
                oddS1[idx1]++;
                oddS2[idx2]++;
            }
        }

        return Arrays.equals(eveS1, eveS2) && Arrays.equals(oddS1, oddS2);
    }
}
//************************************************Memory: 47.84MB || Beats : 85.53% ************************************Runtime: 6ms || Beats : 61.84% **************************************************************************
