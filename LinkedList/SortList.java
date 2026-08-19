class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
   
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next=null;
        head = sortList(head);
        head2 = sortList(head2);
        return merge(head,head2);
    }
   public ListNode merge(ListNode head,ListNode head2){
     ListNode a = head;
     ListNode b= head2;
     ListNode dummy = new ListNode(-1);
     ListNode temp = dummy;
     while(a!=null && b!=null){
        if(a.val<=b.val){
          temp.next=a;
          a=a.next;
        } 
        else{
            temp.next=b;
            b=b.next;
        }
        temp=temp.next;
     }
     if(a==null) temp.next=b;
     else temp.next=a;

     return dummy.next;
   }
}
