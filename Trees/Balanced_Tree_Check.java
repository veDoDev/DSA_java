/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) 
    {
        if(root == null)
            return true;
        
        boolean leftIsNull, rightIsNull;
        
        try{
            leftIsNull = (root.left == null);
        }catch(NullPointerException e){
            leftIsNull = true;
        }
        
        try{
            rightIsNull = (root.right == null);
        }catch(NullPointerException w){
            rightIsNull = true;
        }
        
        if(leftIsNull && rightIsNull)
            return true;
            
        int leftLen = (leftIsNull)?(0):(BranchLen(root.left));
        int rightLen = (rightIsNull) ? (0) : (BranchLen(root.right));
        
        if(leftLen == -1 || rightLen == -1)
            return false;
        
            
        return (Math.abs(leftLen - rightLen) <= 1);
    }
    
    public int BranchLen(Node currNode)
    {
        if(currNode == null)
            return 0;
        int leftLen, rightLen;
        leftLen = (currNode.left == null) ? (0) : (BranchLen(currNode.left));
        rightLen = (currNode.right == null) ? (0) : (BranchLen(currNode.right));
        
        if(leftLen == -1 || rightLen == -1)
            return -1;
            
        if(Math.abs(leftLen - rightLen) <= 1)
            return 1 + Math.max(leftLen, rightLen);
            
        return -1;
    }
} 
