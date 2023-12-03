class Solution {
    public ListNode helper(ListNode head, ListNode prev){
        //base case
        if(head == null){
            return prev;
        }

        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;

        return helper(head, prev);

    }
    public ListNode reverseList(ListNode head) {
        
        return helper(head, null);

    }
}
