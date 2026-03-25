class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int n1 = makeHashedCode(s);
        int n2 = makeHashedCode(t);

        return (n1 == n2);
        
    }

    private int makeHashedCode(String s)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int lastMax = 0;
        int hashCode = 0;

        for(char i : s.toCharArray())
        {
            if(hashMap.containsKey(i))
            {
                hashCode = hashCode*10 + hashMap.get(i);
            }
            else
            {
                hashMap.put(i, lastMax++);
                hashCode = hashCode*10 + lastMax;
            }
        }

        return hashCode;
    }
}
