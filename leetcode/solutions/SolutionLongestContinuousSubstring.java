package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionLongestContinuousSubstring extends Solution {
    private int solution(String s) {
        int ans = 0;

        return ans;
    }
    @Override
    public String solution(Context context) {
        try {
            return Integer.valueOf(solution((String) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }

}
