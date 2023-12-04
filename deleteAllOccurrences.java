public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.
        Node temp = head;

        while(temp != null){
            if(temp.data == k){
                //if temp is head
                if(temp == head){
                    temp = temp.next;
                    head = temp;
                    if (head == null){
                        return null;
                    }
                    head.prev = null;
                }
                else{
                    temp.prev.next = temp.next;
                    temp = temp.next;
                    if(temp == null){
                        break;
                    }
                    temp.prev = temp.prev.prev;
                }
            }
            else{
                temp = temp.next;
            }
        }

        return head;
    }
}
