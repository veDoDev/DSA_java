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
    HashMap<Integer, int[]> nodeMap;
    public TreeNode createBinaryTree(int[][] descriptions) 
    {
        int ptr = 0;
        Set<Integer> nodes = new HashSet<>();
        nodeMap = new HashMap<>();

        for(int[] des : descriptions)
        {
            nodes.add(des[1]);
            nodeMap.putIfAbsent(des[0], new int[]{-1, -1});

            if(des[2] == 0)
                nodeMap.get(des[0])[1] = des[1];
            else
                nodeMap.get(des[0])[0] = des[1];
            
        }

        int head = -1;
        TreeNode root;
        for(int[] des : descriptions)
        {
            if(!nodes.contains(des[0]))
            {
                head = des[0];
                break;
            }
        }

        root = new TreeNode(head);

        fillItUp(root);
        return root;
    }

    private void fillItUp(TreeNode curr)
    {
        int[] children = nodeMap.get(curr.val);
        if(children == null)
            return;

        int leftChild = children[0];
        int rightChild = children[1];

        if(leftChild != -1)
        {
            curr.left = new TreeNode(leftChild);
            fillItUp(curr.left);
        }

        if(rightChild != -1)
        {
            curr.right = new TreeNode(rightChild);
            fillItUp(curr.right);
        }
    }
}
