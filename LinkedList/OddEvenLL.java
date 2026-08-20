class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t = head;
        ListNode t1 = d1;
        ListNode t2 = d2;
        int n = 0;
        while(t!=null){
            t=t.next;
            n++;
        }
        t=head;

       for(int i=1;i<=n;i++){
        if(i%2!=0){
            t1.next=t;
            t1=t1.next;
        }
        else{
            t2.next=t;
            t2=t2.next;
        }
        t=t.next;
       }
        t1.next=d2.next;
        t2.next=null;
        return d1.next;
    }
}
