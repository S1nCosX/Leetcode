public class Main {
    public static void main(String[] args){
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode l2 = new ListNode(9, new ListNode( 9, null));
        System.out.println(SolutionAddTwoNumbers.solution(l1, l2));
    }
}
