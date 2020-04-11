package algorithm.HackerRank;

import java.util.ArrayList;
import java.util.List;

/***
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String args[]) {
       /*ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l111 = new ListNode(3);
        l1.next = l11;
        l11.next = l111;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l222 = new ListNode(4);
        l2.next = l22;
        l22.next = l222;*/
        ListNode l1 = new ListNode(9);
        ListNode l11 = new ListNode(9);
        l1.next = l11;
        ListNode l2 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        l2.next = l22;
        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        do {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            list.add(val1 + val2);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        } while (l1 != null || l2 != null);

        if (list.size() < 1) return null;

        ListNode root = new ListNode(list.get(0) % 10);
        if (list.size() == 1 && list.get(0) >= 10) {
            root.next = new ListNode(list.get(0) / 10);
            return root;
        }

        ListNode listNode = root;
        int remain = list.get(0) / 10;
        for (int i = 1; i < list.size(); i++) {
            int val = list.get(i) + remain;
            ListNode node = new ListNode(val % 10);
            listNode.next = node;
            listNode = node;
            remain = val / 10;
        }

        if (remain > 0) {
            listNode.next = new ListNode(remain);
        }

        return root;
    }

    static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
