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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode curr=temp;
        if (head==null || head.next==null) {
            return head;
        }
        while (curr.next!=null && curr.next.next!=null) {
            if(curr.next.val==curr.next.next.val) {
                int value=curr.next.val;
                while(curr.next!=null && curr.next.val==value) {
                    curr.next=curr.next.next;
                }
            }
            else{
                curr=curr.next;
            }
        }

        return temp.next;
    }
}