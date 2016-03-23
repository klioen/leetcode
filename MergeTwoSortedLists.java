tion for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode head = root;
        while(l1 != null && l2 != null) {
            ListNode p = new ListNode(l1.val);
            ListNode q = new ListNode(l2.val);
            if(l1.val <= l2.val) {
                head.next = p;
                head = head.next;
                l1 = l1.next;
            } else {
                head.next = q;
                head = head.next;
                l2 = l2.next;
            }
        }
        if(l1 == null)
            head.next = l2;
        else
            head.next = l1;
            
        return root.next;
    }
}
