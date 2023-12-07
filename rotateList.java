class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        int size = 0;
        ListNode temp2 = head;

        while(temp2 != null){
          size++;
          temp2 = temp2.next;
        }

        k = k%size;

        for(int i=0; i<k; i++){
            ListNode temp = head;

            while(temp.next.next != null){
                temp = temp.next;
            }

            temp.next.next = head;
            head = temp.next;
            temp.next = null;
        }

        return head;
    }
}
