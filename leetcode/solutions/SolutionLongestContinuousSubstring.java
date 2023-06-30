package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionLongestContinuousSubstring extends Solution {
    private int solution(String s) {
        int ans = 0;
        for (int i = 0; i < s.length();){
            int curL = 1;
            i++;
            while (i < s.length() && s.charAt(i) - 1 == s.charAt(i - 1)){
                curL++;
                i++;
            }
            ans = Math.max(ans, curL);
        }
        return ans;
    }
    @Override
    public Integer solution(Context context) {
        return solution((String) context.getContext()[0]);
    }
}
