public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> mySet = new HashSet<>();

        while(headA != null){
            mySet.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(mySet.contains(headB)){
                return headB;
            }
            else{
                headB = headB.next;
            }
        }

        return null;
    }
}
