class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode c = head;
     ListNode f = null;
     ListNode p = null;
     while(c!=null){
        f=c.next;
        c.next=p;
        p=c;
        c=f;
     }
     return p;
    }
}
