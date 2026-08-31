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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        int pos = 1;

        int firstCritical = -1;
        int prevCritical = -1;

        int min = Integer.MAX_VALUE;

        while (next != null) {

            // Check whether curr is a critical point
            boolean critical =
                (curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val);

            if (critical) {

                // First critical point
                if (firstCritical == -1) {
                    firstCritical = pos;
                } 
                else {
                    // Distance from previous critical point
                    min = Math.min(min, pos - prevCritical);
                }

                // Current critical point becomes previous
                prevCritical = pos;
            }

            // Move pointers forward
            prev = curr;
            curr = next;
            next = next.next;

            pos++;
        }

        // Fewer than 2 critical points
        if (firstCritical == prevCritical) {
            return new int[]{-1, -1};
        }

        int max = prevCritical - firstCritical;

        return new int[]{min, max};
    }
}