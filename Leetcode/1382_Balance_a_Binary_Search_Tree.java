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
    public TreeNode balanceBST(TreeNode root) 
    {
        ArrayList<Integer> allVals = new ArrayList<>();

        exploreNodes(allVals, root);
        int n = allVals.size();
        TreeNode resTree = putNodes(allVals, 0, n - 1);

        return resTree;
    }

    public void exploreNodes(ArrayList<Integer> allVals, TreeNode currNode)
    {
        //explore left
        if(currNode.left != null)
            exploreNodes(allVals, currNode.left);
                
        //add current
        allVals.add(currNode.val);

        //explore right
        if(currNode.right == null)
            return;
        else      
            exploreNodes(allVals, currNode.right);
    }

    public TreeNode putNodes(ArrayList<Integer> allVals, int start, int end)
    {
        if(start > end)
            return null;

        int mid = start + (end - start)/2;
        TreeNode currNode = new TreeNode(allVals.get(mid));


        if(start == end)
            return currNode;
        

        currNode.left = putNodes(allVals, start, mid-1);
        currNode.right = putNodes(allVals, mid + 1, end);
        //current node is now established with both daughters

        return currNode;
    }
}
