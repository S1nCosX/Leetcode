import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SolutionPalindrom {
    static public boolean isPalindrome(String s) {
        boolean flag = true;
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        for (int i = 0; flag && i < s.length() / 2; i++)
            flag = (s.substring(i, i + 1).compareToIgnoreCase(s.substring(s.length() - 1 - i,s.length() - i)) == 0);
        return flag;
    }

    public static boolean isPalindrome(ListNode head) {
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
}
