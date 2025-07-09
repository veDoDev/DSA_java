import java.util.*;

class Solution {

    private static final class Node 
    {
        final int i, j, sum;
        Node(int i, int j, int sum) 
        { 
            this.i = i; 
            this.j = j; 
            this.sum = sum; 
        }
    }

    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {

        int n = a.length;                       // n == b.length per constraints
        ArrayList<Integer> result = new ArrayList<>(k);

        Arrays.sort(a);
        Arrays.sort(b);
        reverse(a);
        reverse(b);

        // 2. Max‑heap on sum (bigger sum → higher priority)
        PriorityQueue<Node> maxHeap = new PriorityQueue<>(
            (x, y) -> Integer.compare(y.sum, x.sum)
        );
        
        // 3. Visited tracking (i*n + j) is unique key; use boolean[] for speed
        BitSet seen = new BitSet();             // size ≈ n * n, but BitSet is sparse
        int key = 0 * n + 0;
        seen.set(key);
        
        // 4. Seed with (0,0)
        maxHeap.add(new Node(0, 0, a[0] + b[0]));
        
        // 5. Extract k times
        while (result.size() < k && !maxHeap.isEmpty()) 
        {
            Node cur = maxHeap.poll();
            result.add(cur.sum);
            // (i+1, j)
            if (cur.i + 1 < n) 
            {
                int nextKey = (cur.i + 1) * n + cur.j;
                if (!seen.get(nextKey)) 
                {
                    maxHeap.add(new Node(cur.i + 1, cur.j, a[cur.i + 1] + b[cur.j]));
                    seen.set(nextKey);
                }
            }
            // (i, j+1)
            if (cur.j + 1 < n) 
            {
                int nextKey = cur.i * n + (cur.j + 1);
                if (!seen.get(nextKey)) 
                {
                    maxHeap.add(new Node(cur.i, cur.j + 1, a[cur.i] + b[cur.j + 1]));
                    seen.set(nextKey);
                }
            }
        }

        return result;
    }

    /** In‑place reverse of an int[] */
    private void reverse(int[] arr) 
    {
        for (int l = 0, r = arr.length - 1; l < r; l++, r--) 
        {
            int tmp = arr[l]; arr[l] = arr[r]; arr[r] = tmp;
        }
    }
}
