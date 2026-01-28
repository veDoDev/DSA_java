class Solution {
    public ArrayList<String> possibleWords(int[] arr) 
    {
        ArrayList<String> res = new ArrayList<>();
        
        String[] keypad = {
            "", "", "abc", "def", 
            "ghi", "jkl", "mno", 
            "pqrs", "tuv", "wxyz"
        };
        
        backtrack(arr, 0, new StringBuilder(), keypad, res);
        
        return res;
    }
    
    public void backtrack(int[] arr, int idx, StringBuilder currStr, String[] keypad, ArrayList<String> res)
    {
        if(idx == arr.length)
        {
            res.add(currStr.toString());
            return;
        }
        
        String letters = keypad[arr[idx]];
        
        
        if(letters.length() == 0)
        {
            backtrack(arr, idx+1, currStr, keypad, res);
            return;
        }
        
        for(int i = 0; i < letters.length(); i++)
        {
            currStr.append(letters.charAt(i));
            backtrack(arr, idx+1, currStr, keypad, res);
            currStr.deleteCharAt(currStr.length() - 1);
        }
        
    }
}
