c class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        int carry = 0;
        while(true) {
                int sum = 0;
                if(l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if(l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                p.val = (sum + carry) % 10;
                carry = (sum + carry) / 10;
                if(l1 == null && l2 == null) {
                    if(carry == 1)
                        p.next = new ListNode(1);
                    break;
                }
                if(l1 != null || l2 != null) {
                    p.next = new ListNode(0);
                    p = p.next;
                } 
        }
        return l3;
    }
}
