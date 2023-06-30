package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionSumOfTwoIntegers extends Solution {
    private int solution(int a, int b) {
        boolean f = (a < 0 && -a < b) || (b < 0 && -b < a);

        if (f){
            a = -a;
            b = -b;
        }

        int ans = a ^ b, buf = (a & b) << 1;

        do{
            a = ans;
            b = buf;
            buf = (a & b) << 1;
            ans = a ^ b;
        }while (buf > 0);
        ans = (ans == -2147483648) ? 0 : ((f) ? -ans : ans);
        return ans;
    }
    @Override
    public String solution(Context context) {
        try {
            return Integer.valueOf(solution((int) context.getContext()[0], (int) context.getContext()[1])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }

}
