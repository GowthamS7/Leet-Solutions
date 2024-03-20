
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      ListNode currnode = list1;
      int index =0;
      while(index < a-1){
        currnode = currnode.next;
        index++;
      }
      ListNode front = currnode;
      while(index < b+1){
        currnode = currnode.next;
        index++;
      }
      ListNode rear = currnode;
      ListNode secondListT = list2, secondListH = list2;
      while(secondListT.next != null){
        secondListT = secondListT.next;
      }
      front.next = secondListH;
      secondListT.next = rear;
      return list1;
    }
}