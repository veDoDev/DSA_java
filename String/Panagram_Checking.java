class Solution {
    public static boolean checkPangram(String s)
    {
        boolean[] visited = new boolean[26];
        
        for(char x : s.toCharArray())
        {
            if(x <= 'z' && x >= 'a')
                visited[x-'a'] = true;
            else if(x >= 'A' && x <= 'Z')
                visited[x-'A'] = true;
        }
        
        for(boolean x : visited)
            if(!x)
                return false;
                
        return true;
    }
}
