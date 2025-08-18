class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int sPtr = 0;
        for(char tPtr : t.toCharArray())
        {
            if((sPtr < s.length()) && (s.charAt(sPtr) == tPtr))
            {
                sPtr++;
            }
        }
        return sPtr == s.length();
        
    }
}


// class Solution {
//     public boolean isSubsequence(String s, String t) 
//     {
//         int sPtr = 0, tPtr = 0;
//         while((sPtr < s.length()) && (tPtr < t.length()))
//         {
//             if(s.charAt(sPtr) == t.charAt(tPtr))
//             {
//                 sPtr++;
//             }
//             tPtr++;
//         }
//         if(sPtr != s.length())  return false;
//         return true;
        
//     }
// }
