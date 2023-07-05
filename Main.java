import leetcode.Context;
import leetcode.SolutionFlyweight;

public class Main {
    public static void main(String[] args){

        System.out.println(SolutionFlyweight.getSolution(6).solution(new Context("A", 1)).equals("A"));
    }
}
