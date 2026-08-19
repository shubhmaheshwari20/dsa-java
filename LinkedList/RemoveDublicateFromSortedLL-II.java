class Solution {
    public ListNode deleteDuplicates(ListNode head) {
     ListNode dummy = new ListNode(-1);
     ListNode temp = dummy;
     ListNode a = head;

     while(a!=null){
        if(a.next==null || a.val!=a.next.val ){
           
           temp.next=a;
            temp=a;
           a=a.next;
        }
        else{
            ListNode b = a.next;
            while( b!=null && a.val==b.val){
                b=b.next;
            }
            a=b;
        }
     }
     temp.next=a;
     return dummy.next;
   }
}
