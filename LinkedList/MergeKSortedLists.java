class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode result = lists[0];
        for(int i=1;i<lists.length;i++){
            result = merge(result,lists[i]);
        }
        return result;
    }
    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode a = head1;
        ListNode b = head2;
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
        if(a!=null) temp.next=a;
        if(b!=null) temp.next=b;
        return dummy.next;
    }
}
