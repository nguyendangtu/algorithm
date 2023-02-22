package algorithm.HackerRank;

import org.w3c.dom.NodeList;

public class MergedTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String args[]) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = mergeTwoLists(list1, list2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode mergeList = null;
        if (list1.val <= list2.val) {
            mergeList = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            mergeList = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode node = mergeList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else if (list2 != null) {
            node.next = list2;
        }

        return mergeList;
    }
}
