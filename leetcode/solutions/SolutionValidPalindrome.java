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
    public String solution(Context context) {
        try {
            return Boolean.valueOf(solution((String) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }

}
