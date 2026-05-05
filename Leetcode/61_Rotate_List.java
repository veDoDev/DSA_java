class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: find length
        ListNode curr = head;
        int n = 1;
        while (curr.next != null) 
        {
            curr = curr.next;
            n++;
        }

        // Step 2: make circular
        curr.next = head;

        // Step 3: find new tail
        k = k % n;
        int stepsToNewTail = n - k - 1;

        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++)
            newTail = newTail.next;
        

        // Step 4: break
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
