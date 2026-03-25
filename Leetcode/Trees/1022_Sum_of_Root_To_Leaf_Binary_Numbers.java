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
class Solution 
{
    public int sumRootToLeaf(TreeNode root) 
    {
        return currBranchSum(root, 0);        
    }

    public int currBranchSum(TreeNode currNode, int currBranch)
    {
        if(currNode == null)
            return 0;

        currBranch = (currBranch << 1) | currNode.val;

        if(currNode.left == null && currNode.right == null)
            return currBranch;

        return currBranchSum(currNode.left, currBranch) + 
                currBranchSum(currNode.right, currBranch);
    }
}
