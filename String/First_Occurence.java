class Solution {
    int firstOccurence(String txt, String pat) 
    {
        int n = txt.length();
        if(pat.length() > n)
            return -1;
            
        for(int i = 0; i < n; i++)
        {
            if(txt.charAt(i) == pat.charAt(0))
            {
                int curr = i;
                boolean flag = true;
                for(char x : pat.toCharArray())
                {
                    if(curr < n && x != txt.charAt(curr++))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    return i;
            }
        }
        
        return -1;
        
    }
}
