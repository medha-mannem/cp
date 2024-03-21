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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            s1.push(curr.val);
            curr=curr.next;
        }
        s2.push(s1.pop());
        while(!s1.isEmpty()){
            if(s1.peek()<s2.peek()){
                s1.pop();
            }
            else{
                s2.push(s1.pop());
            }
        }
        ListNode newHead = new ListNode(s2.pop());
        ListNode newCurr = newHead;
        while(!s2.isEmpty()){
            newCurr.next = new ListNode(s2.pop());
            newCurr=newCurr.next;
        }
        return newHead;
        
    }
}
