package com.crackcode.leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node  = new ListNode(0);
        ListNode dummy = node;
        int carry = 0;
        while(l1 != null || l2 != null){ // 2, 4, 3 ... 5, 6, 4
            int x = 0, y = 0;
            if(l1 != null){
                x = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                y = l2.val;
                l2 = l2.next;
            }
            int sum  = carry + x + y;
            carry = sum / 10;
            node.next = new ListNode(sum%10);
            node = node.next;
        }
        if(carry > 0){
            node.next = new ListNode(carry);
        }
        return dummy.next;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}