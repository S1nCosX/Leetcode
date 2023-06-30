import leetcode.Context;
import leetcode.ListNode;
import leetcode.SolutionFactory;
import leetcode.Task;

public class Main {
    public static void main(String[] args){
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode l2 = new ListNode(9, new ListNode( 9, null));
        System.out.println(SolutionFactory.getSolution(Task.ADDTWONUMBERS).solution(new Context(l1, l2)));
    }
}
