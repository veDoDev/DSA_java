/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
//
class Solution {
    Node balanceBST(Node root) 
    {
        ArrayList<Integer> allVals = new ArrayList<>();

        exploreNodes(allVals, root);
        int n = allVals.size();
        Node resTree = putNodes(allVals, 0, n - 1);

        return resTree;
    }
    
    public void exploreNodes(ArrayList<Integer> allVals, Node currNode)
    {
        //explore left
        if(currNode.left != null)
            exploreNodes(allVals, currNode.left);
                
        //add current
        allVals.add(currNode.data);

        //explore right
        if(currNode.right == null)
            return;
        else      
            exploreNodes(allVals, currNode.right);
    }
    
    public Node putNodes(ArrayList<Integer> allVals, int start, int end)
    {
        if(start > end)
            return null;

        int mid = start + (end - start)/2;
        Node currNode = new Node(allVals.get(mid));


        if(start == end)
            return currNode;
        

        currNode.left = putNodes(allVals, start, mid-1);
        currNode.right = putNodes(allVals, mid + 1, end);
        //current node is now established with both daughters

        return currNode;
    }
}
