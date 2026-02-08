/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;

        int leftLen, rightLen;
        boolean leftIsBalanced, rightIsBalanced;
        boolean leftIsNull, rightIsNull;

        leftIsNull = (root.left == null); 
        rightIsNull = (root.right == null);

        if(leftIsNull && rightIsNull)
            return true;

        try{
            leftLen = (leftIsNull) ? (0) : (BranchLen(root.left, 0));
            if(leftLen == -1)
                return false;

        }catch(NullPointerException e){
            leftLen = 0;
        }

        try{
            rightLen = (rightIsNull) ? (0) : (BranchLen(root.right, 0));
            if(rightLen == -1)
                return false;
        }catch(NullPointerException e){
            rightLen = 0;
        }

        return (Math.abs(leftLen - rightLen) <= 1);
    }

    public int BranchLen(TreeNode currNode, int count)
    {
        if(currNode == null)
            return 0;

        int rightLen, leftLen;
        rightLen = BranchLen(currNode.right, 0);
        leftLen = BranchLen(currNode.left, 0);

        if(rightLen == -1 || leftLen == -1)
            return -1;

        if(Math.abs(leftLen-rightLen) <= 1)
            return 1 + Math.max(leftLen, rightLen);
        
        return -1;
    }
}
