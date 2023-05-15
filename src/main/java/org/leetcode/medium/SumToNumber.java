package org.leetcode.medium;
public class SumToNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        ListNode head = null;
        ListNode l3 = null;
        while(l1!=null || l2!=null){
            sum += (l1!=null)?l1.val:0 ;
            sum += (l2!=null)?l2.val:0;
            ListNode loc = new ListNode();
            loc.val = sum%10;
            sum /=10;
            if(l3==null){
                l3=loc;
                head = loc;
            }
            else{
                l3.next = loc;
                l3 = l3.next;
            }

            l1 =(l1!=null)? l1.next:null;
            l2 = (l2!=null)?l2.next:null;
        }
        if(sum>0)
        {
            ListNode loc = new ListNode();
            loc.val = sum%10;
            l3.next = loc;
        }
        return head;
    }
    public class ListNode {
    int val;
      ListNode next;
      ListNode() {}     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}