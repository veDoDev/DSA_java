/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    int count=0,i;
    struct ListNode *temp=head, *temp2=head, *temp3=head;
    while(temp!=NULL)
    {
        count++;
        temp=temp->next;
    }
    printf(" total nodes is: %d\n",count);
    int a;
    a=count/2;
    printf("middle index number of nodes is: %d",a);
    for(i=0;i<a;i++)
    {
        temp2=temp3;
        temp3=temp3->next;
    }
    temp2->next=temp3->next;
    free(temp3);
    return head;
}
