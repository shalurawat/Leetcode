
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        if(head.next == head){
            return 1;
        }

      //detect loop
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(slow != fast){
            return 0;
        }

      //find where the cycle started
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        //count the length
        int count = 1;
        fast = fast.next;

        while(slow != fast){
            count++;
            fast = fast.next;
        }

        return count;
    }
}
