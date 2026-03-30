//----------------------------------------------------------------------------------Approach 4 : Use 2D array for resource optimisation---------------------------------------------------------------------------------------------
class Solution {
    public boolean checkStrings(String s1, String s2) 
    {
        int n = s1.length();
        int eveLen = (n%2 == 0) ? (n/2) : (n/2 + 1);
        int oddLen = n/2;

        int[][] freq = new int[2][26];

        for(int i = 0; i < n; i++)
        {
            freq[i%2][s1.charAt(i) - 'a']++;
            freq[i%2][s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(freq[0][i] != 0 || freq[1][i] != 0)
                return false;
        }

        return true;
    }
}
//************************************************Memory: 47.67MB || Beats : 98.68% ************************************Runtime: 5ms || Beats : 98.68% **************************************************************************
