package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionZigzagConversion extends Solution {

    private String solution(String s, int numRows){
        String ans = "";

        for (int i = 0; i < numRows; i++){
            if (i == 0 || i == numRows - 1)
                for (int j = i; j < s.length(); ans += s.charAt(j), j += numRows * 2 - 2 + ((numRows == 1) ? 1 : 0));
            else
                for (int j = i; j < s.length();){
                    ans += s.charAt(j);
                    j += numRows * 2 - 2 * (i + 1);
                    ans += (j < s.length()) ? s.charAt(j) : "";
                    j += 2 * i;
                }

        }
        return ans;
    }
    @Override
    public String solution(Context context) {
        return solution((String) context.getContext()[0], (int) context.getContext()[1]);
    }
}
