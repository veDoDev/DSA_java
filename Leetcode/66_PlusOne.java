class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        
        int[] result = new int[n + 1];
        result[0] = 1;  
        return result;
    }
}
// this was an interesting question my previous attempt in solving this was first parsing the number from the array and then adding 
// one to it and then deparsing it again into the array, this technique was problematic due to the fact that i had to run 2 loops 
// and manage the extra space, this meyjhod in the other hand ios much more easy to understand and implement
