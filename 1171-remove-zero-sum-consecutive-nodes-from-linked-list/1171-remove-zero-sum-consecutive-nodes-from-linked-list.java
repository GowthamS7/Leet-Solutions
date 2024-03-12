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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode current = head;
        HashMap<Integer, ListNode> summap = new HashMap<>();
        int sum = 0;
        while(current != null){
            sum += current.val;
            if(sum==0){
                head = current.next;
            }else{
                summap.put(sum, current);
            }
            current = current.next;
        }
        sum = 0;
        current = head;
        while(current != null){
            sum += current.val;
        if(summap.containsKey(sum)){
            current.next = summap.get(sum).next;
        }
        current = current.next;
        }
        return head;
    }
}