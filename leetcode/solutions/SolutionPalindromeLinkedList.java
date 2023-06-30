package leetcode.solutions;

import leetcode.Context;
import leetcode.ListNode;
import leetcode.Solution;

public class SolutionPalindromeLinkedList extends Solution {
    private boolean solution(ListNode head) {
        int n = 0;
        ListNode tail = null;
        for (ListNode i = head; i != null; tail = i, i = i.next, n++);

        ListNode past = null;
        ListNode cur = head;
        ListNode next = head.next;
        for (int cnt = 0; cur != null; past = cur, cur = next, next = ((next != null) ? next.next : null), cnt++)
            if (cnt >= n / 2 + n % 2)
                cur.next = past;

        boolean ans = true;
        past = null;
        next = tail.next;
        int cnt = 0;
        for (ListNode i = head; cnt < n / 2 + n % 2; i = i.next, tail.next = past, past = tail, tail = next, next = ((next != null) ? next.next : null), cnt++)
            if (i.val != tail.val)
                ans = false;

        return ans;
    }
    @Override
    public Boolean solution(Context context) {
        return solution((ListNode) context.getContext()[0]);
    }
}
