class Solution {
    public boolean checkIfPangram(String s) 
    {
        if(s.length()<26)
            return false;
        boolean[] visited = new boolean[26];
        
        for(char x : s.toCharArray())
            visited[x-'a'] = true;
        
        for(boolean x : visited)
            if(!x)
                return false;
                
        return true;
        
    }
}
