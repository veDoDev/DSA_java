class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        return (s.length() == goal.length()) && (s + s).contains(goal);
    }
}

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if (s.length() != goal.length()) return false;
//         if (s.equals(goal)) return true;

//         int len = s.length();

//         // Try every possible rotation
//         for (int i = 1; i < len; i++) {
//             boolean match = true;

//             for (int j = 0; j < len; j++) {
//                 if (s.charAt(j) != goal.charAt((i + j) % len)) {
//                     match = false;
//                     break;
//                 }
//             }

//             if (match) return true;
//         }

//         return false;
//     }
// }

