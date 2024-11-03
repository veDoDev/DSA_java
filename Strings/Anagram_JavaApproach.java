//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s, String t) {

        if(s.length() != t.length())    return false;
        HashMap<Character, Integer> str1 = new HashMap<>();
        HashMap<Character, Integer> str2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = Character.toLowerCase(s.charAt(i)); 
            char c2 = Character.toLowerCase(t.charAt(i));

            
            str1.put(c1, str1.getOrDefault(c1, 0) + 1);
            
            str2.put(c2, str2.getOrDefault(c2, 0) + 1);
        }

        if(str1.equals(str2)) return true;
        return false;
    }
}
