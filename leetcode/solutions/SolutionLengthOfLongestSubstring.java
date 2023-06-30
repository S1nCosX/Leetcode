package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionLengthOfLongestSubstring extends Solution {
    private int solution(String s) {
        if (s.length() == 0)
            return 0;

        List <Integer> ans = new ArrayList<>();
        int breakPoint = 0;
        for (int i = 0; i < s.length(); i++){
            ans.add(1);
            int j = i - 1;
            while (j >= breakPoint && s.charAt(j) != s.charAt(i)){
                ans.set(j, ans.get(j) + 1);
                j--;
            }
            breakPoint = Math.max(breakPoint, j);
        }

        return ans.stream().max(Integer::compare).get();
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
