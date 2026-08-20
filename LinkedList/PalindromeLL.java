class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }
      ListNode head2=slow.next;
      slow.next=null;
      head2 = reverse(head2);

      ListNode temp1 = head;
      ListNode temp2 = head2;
      while(temp2!=null){
        if(temp1.val!=temp2.val) return false;
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return true;
    }
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode f = null;
        while(c!=null){
            f = c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
}
