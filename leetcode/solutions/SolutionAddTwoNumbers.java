package leetcode.solutions;

import leetcode.Context;
import leetcode.ListNode;
import leetcode.Solution;

public class SolutionAddTwoNumbers extends Solution {
    private ListNode solution(ListNode l1, ListNode l2){
        int n1 = 0, n2 = 0;
        for (ListNode b1 = l1; b1 != null; b1 = b1.next, n1++);
        for (ListNode b2 = l2; b2 != null; b2 = b2.next, n2++);

        if (n2 > n1){
            ListNode b = l2;
            l2 = l1;
            l1 = b;
            int bn = n2;
            n2 = n1;
            n1 = bn;
        }

        ListNode next = new ListNode();
        ListNode ans = next;
        int b = 0;
        while (l2 != null){
            int newVal = l1.val + l2.val + b;
            next.next = new ListNode();
            next.val = newVal  % 10;
            b = newVal / 10;

            next = next.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int newVal = l1.val + b;
            next.next = new ListNode();
            next.val = newVal  % 10;
            b = newVal / 10;

            next = next.next;
            l1 = l1.next;
        }
        next = ans;
        while (next.next.next != null) next = next.next;
        if (b > 0)
            next.next = new ListNode(b, null);
        else
            next.next = null;
        return ans;
    }

    @Override
    public ListNode solution(Context context) {
           return solution((ListNode) context.getContext()[0], (ListNode) context.getContext()[1]);
    }
}
