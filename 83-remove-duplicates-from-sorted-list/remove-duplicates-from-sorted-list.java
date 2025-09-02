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
        LinkedHashSet<Integer> unique=new LinkedHashSet<>();

        ListNode temp=head;
        while(temp !=null){
            unique.add(temp.val);
            temp=temp.next;
        }
        ListNode ans=new ListNode(-1);
        ListNode tail=ans;

        for(int num:unique){
            tail.next=new ListNode(num);
            tail=tail.next;
        }
        return ans.next;
    }
}