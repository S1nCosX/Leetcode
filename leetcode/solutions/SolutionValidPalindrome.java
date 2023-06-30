package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionValidPalindrome extends Solution {
     private boolean solution(String s) {
        boolean flag = true;
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        for (int i = 0; flag && i < s.length() / 2; i++)
            flag = (s.substring(i, i + 1).compareToIgnoreCase(s.substring(s.length() - 1 - i,s.length() - i)) == 0);
        return flag;
    }
    @Override
    public Boolean solution(Context context) {
        return solution((String) context.getContext()[0]);
    }
}
