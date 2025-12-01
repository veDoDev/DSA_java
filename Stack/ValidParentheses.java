class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> checkPara = new Stack<>();

        for (char x : s.toCharArray()) 
        {

            if (x == '{' || x == '[' || x == '(') 
                checkPara.push(x);     // push opening brackets
            else 
            {
                // For closing brackets:
                if (checkPara.isEmpty()) return false;
                
                char top = checkPara.pop();

                if (x == '}' && top != '{') return false;
                if (x == ']' && top != '[') return false;
                if (x == ')' && top != '(') return false;
            }
        }

        return checkPara.isEmpty();
    }
}
