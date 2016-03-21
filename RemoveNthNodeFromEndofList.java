tion for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int length = 1;
        while(p.next != null) {
            p = p.next;
            length++;
        }
        
        ListNode q = head;
        if(n == length)
            head = head.next;
        else {
            for(int i=1; i < length - n; i++) {
                q = q.next;
            }
            q.next = q.next.next;
        }
        return head;      
    }
}
