/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    if(!head || (!head->next))  return NULL; // one element or empty list

    struct ListNode *mid = head, *upper = head, *upperPrev = NULL;

    while (upper && upper->next)
    {
        upperPrev = mid;
        mid = mid->next;
        upper = upper->next->next;
    }

    upperPrev->next = mid->next;
    free(mid);

    return head;
}
