class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int head = n - 1, tail = 0;
        StringBuilder res = new StringBuilder(s);
        Set<Character> vowels = new HashSet<>(Set.of('A','E','I','O','U','a','e','i','o','u'));

        while (tail < head) 
        {
            // Move tail forward until it points to a vowel
            while (tail < head && !vowels.contains(s.charAt(tail)))
                tail++;

            // Move head backward until it points to a vowel
            while (tail < head && !vowels.contains(s.charAt(head)))
                head--;

            // Swap vowels
            if (tail < head)
            {
                swap(res, tail, head);
                tail++;
                head--;
            }
        }

        return res.toString();
    }

    private void swap(StringBuilder sb, int idx1, int idx2) 
    {
        char char1 = sb.charAt(idx1);
        char char2 = sb.charAt(idx2);
        sb.setCharAt(idx1, char2);
        sb.setCharAt(idx2, char1);
    }
}
//-----------------------------------------------------------Most optimal solution-------------------------------------------------------------------
// class Solution {
//     public String reverseVowels(String s) {
//         boolean[] vowels=new boolean[128];
//         for(char ch : "aeiouAEIOU".toCharArray()){
//             vowels[ch]=true;
//         }
//         int i=0;
//         int j=s.length()-1;
//         char[] arr=s.toCharArray();
//         while(i<j){

//             while(i<j && !vowels[arr[i]]){
//                 i++;
//             }
//             while(i<j && !vowels[arr[j]] ){
//                 j--;
//             }
//             char temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         return String.valueOf(arr);
//     }

    
// }
