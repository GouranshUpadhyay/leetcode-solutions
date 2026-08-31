/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(head == null || head.next == null || k == 0) return head;
        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k = k % length;
        if(k==0) return head;
        int steps=length-k;
        ListNode newtail=head;
        for(int i=1;i<steps;i++){
        newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        tail.next=head;
        newtail.next=null;
        return newhead;
    }
}