import leetcode.Context;
import leetcode.SolutionFlyweight;

public class Main {
    public static void main(String[] args){
        int[] nums = {4,6,5,9,3,7}, l = {0,0,2}, r = {2,3,5};
        System.out.println(SolutionFlyweight.getSolution(1630).solution(new Context(nums, l, r)));
    }
}
