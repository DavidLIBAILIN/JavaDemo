package Leetcode_21;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode ln2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        System.out.println(mtsl.mergeTwoLists(ln1, ln2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If list1 is null list
        if (list1 == null) {
            return list2;
        // If list2 is null list
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }

}
