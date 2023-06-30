package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionLongestCommonPrefix extends Solution {
    private String solution(String[] strs) {
        String output = "";

        int len = (int) 1e9;
        for (String a : strs)
            if (a.length() < len)
                len = a.length();

        for (int i = 0; i < len; i++){
            char a = strs[0].charAt(i);
            for (String b : strs)
            {
                if (b.charAt(i) != a){
                    return output;
                }
            }
            output = output + a;
        }
        return output;
    }
    @Override
    public String solution(Context context) {
            return solution((String[]) context.getContext()[0]);
    }
}
