//------------------------------------------------------------------------------Fastest------------------------------------------------------------------------------------------------------
class Solution {
    public String removeOuterParentheses(String s) 
    {
        StringBuilder res = new StringBuilder();
        int depth = 0;

        for(char i : s.toCharArray())
        {
            if(i == '(')    
            {
                if(depth != 0)   
                    res.append(i);

                depth++;
            }
            else
            {
                if(depth != 1)
                    res.append(i);

                depth--;
            }
        }

        return res.toString();
        
    }
}

//---------------------------------------------------------------------------Second Thought---------------------------------------------------------------------------------------------------
// class Solution {
//     public String removeOuterParentheses(String s) 
//     {
//         Stack<Character> stack = new Stack<>();
//         StringBuilder res = new StringBuilder();

//         for(int n = 0; n < s.length(); n++)
//         {
//             char i = s.charAt(n);
//             if(i == '(')    
//             {
//                 if(stack.size() != 0)   
//                     res.append(i);

//                 stack.push('(');
//             }
//             else
//             {
//                 if(stack.size() != 1)
//                     res.append(i);

//                 stack.pop();
//             }
//         }

//         return res.toString();
        
//     }
// }


//---------------------------------------------------------------------------First Thought----------------------------------------------------------------------------------------------------
// class Solution {
//     public String removeOuterParentheses(String s) 
//     {
//         Stack<Character> stack = new Stack<>();
//         String res = "";

//         for(int n = 0; n < s.length(); n++)
//         {
//             char i = s.charAt(n);
//             if(i == '(')    
//             {
//                 if(stack.size() != 0)   
//                     res += "" + i;

//                 stack.push('(');
//             }
//             else
//             {
//                 if(stack.size() != 1)
//                     res += "" + i;

//                 stack.pop();
//             }
//         }

//         return res;
        
//     }
// }
