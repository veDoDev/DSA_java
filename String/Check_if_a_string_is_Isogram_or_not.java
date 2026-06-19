class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) 
    {
        int[] freq = new int[26];
        
        for(char x: data.toCharArray())
            if(++freq[x-'a'] > 1)
                return false;
                
        return true;
        // Your code here
        
    }
}
