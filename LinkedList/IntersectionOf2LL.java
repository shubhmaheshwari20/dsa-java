public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null){
            temp1=temp1.next;
            l1++;
        }
         while(temp2!=null){
            temp2=temp2.next;
            l2++;
        }
        temp2 = headB;
        temp1 = headA;
        if(l2>l1){
            int a = l2-l1;
            for(int i=1;i<=a;i++){
                temp2=temp2.next;
            }
        }
        else {
            int b = l1-l2;
            for(int i=1;i<=b;i++){
                temp1=temp1.next;
            }
        }
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2) return temp1;
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return null;
    }
}
