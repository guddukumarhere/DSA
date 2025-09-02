class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: collect values
        LinkedList<Integer> values = new LinkedList<>();

        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }

        // Step 2: sort values
        Collections.sort(values);

        // Step 3: rebuild linked list
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        // Step 4: return new head
        return dummy.next;
    }
}
