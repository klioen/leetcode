tion for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       head = dummy;
       while(head.next != null && head.next.next != null) {
           ListNode first = head.next;
           ListNode second = head.next.next;
           first.next = second.next;
           head.next = second;
           second.next = first;
           head = head.next.next;
       }
       return dummy.next;
    }
}
