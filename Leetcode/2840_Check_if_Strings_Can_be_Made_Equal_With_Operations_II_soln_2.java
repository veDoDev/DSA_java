//----------------------------------------------------------------------------------Approach 2 : Use HashMaps -(Costs a lot of time)---------------------------------------------------------------------------------------------
class Solution {
    public boolean checkStrings(String s1, String s2) 
    {
        int n = s1.length();
        HashMap<Character, Integer> eve1 = new HashMap<>();
        HashMap<Character, Integer> odd1 = new HashMap<>();
        HashMap<Character, Integer> eve2 = new HashMap<>();
        HashMap<Character, Integer> odd2 = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            if(i%2 == 0)
            {
                eve1.put(s1.charAt(i), eve1.getOrDefault(s1.charAt(i), 0) + 1);
                eve2.put(s2.charAt(i), eve2.getOrDefault(s2.charAt(i), 0) + 1);
            }
            else
            {
                odd1.put(s1.charAt(i), odd1.getOrDefault(s1.charAt(i), 0) + 1);
                odd2.put(s2.charAt(i), odd2.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }

        return eve1.equals(eve2) && odd1.equals(odd2);
    }
}
//************************************************Memory: 48.2MB || Beats : 38.16% ************************************Runtime: 42ms || Beats : 14.47% **************************************************************************
