class Solution {
    public static String concatenatedString(String s1, String s2) 
    {
        int[] all = new int[26];
        for(char x : s1.toCharArray())
            all[x-'a'] = 1;
            
        for(char x : s2.toCharArray())
            if(all[x-'a'] == 1 || all[x-'a'] == -1)
                all[x-'a'] = -1;
            else
                all[x-'a'] = -2;
                
        StringBuilder res = new StringBuilder();
        for(char x : s1.toCharArray())
            if(all[x-'a'] == 1)
                res.append(x);
                
        for(char x : s2.toCharArray())
            if(all[x-'a'] == -2)
                res.append(x);
                
        return (res.length() == 0) ? ("-1") : res.toString();
    }
}
