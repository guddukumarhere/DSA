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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        int count1=0,count2=0;
        
        while(temp !=null){
            count1++;
            temp = temp.next;
        }
        temp=list2;
        while(temp !=null){
            count2++;
            temp =temp.next;
        }
        int n=count1+count2;
        int[] len=new int[n];

        int i=0;
        temp =list1;
        while(temp !=null){
            len[i++]=temp.val;
            temp = temp.next;
        }
        temp = list2;
        while (temp != null) {
            len[i++] = temp.val;
            temp = temp.next;
        }

        // Step 4: Sort array
        Arrays.sort(len);

        // Step 5: Build new LinkedList from array
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : len) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
        
    }
}