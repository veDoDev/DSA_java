class Solution {
    public void rearrange(int[] arr, int x) 
    {
        int n = arr.length;
        
        Node[] nodeArr = new Node[n];
        
        for(int i = 0; i < n; i++)
            nodeArr[i] = new Node(arr[i], Math.abs(arr[i] - x), i);
        
        Arrays.sort(nodeArr);
        
        for(int i = 0; i < n; i++)
            arr[i] = nodeArr[i].element;
    }
}

class Node implements Comparable<Node>{
    int element, diff, idx;
    
    Node(int element, int diff, int idx)
    {
        this.element = element;
        this.diff = diff;
        this.idx = idx;
    }
    
    public int compareTo(Node n2)
    {
        int currDiff = this.diff - n2.diff;
        return (currDiff == 0) ? (this.idx - n2.idx) : (currDiff);
    }
}
 
