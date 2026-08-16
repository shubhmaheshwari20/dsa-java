class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(length==1) return null;
        temp=head;
        int del = length-n;
        if(del==0) return head.next;
        for(int i=1;i<del;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
