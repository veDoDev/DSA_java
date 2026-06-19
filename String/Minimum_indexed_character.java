class Solution {
    public static int minIndexChar(String s1, String s2) 
    {
        HashSet<Character> s2Set = new HashSet<>();
        for(char x: s2.toCharArray())
            s2Set.add(x);
            
        for(int i = 0; i < s1.length(); i++)
            if(s2Set.contains(s1.charAt(i)))
                return i;
                
        return -1;
    }
}
