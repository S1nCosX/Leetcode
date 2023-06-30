package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionCheckArithmeticSubarrays extends Solution {
    public List<Boolean> solution(int[] nums, int[] l, int[] r) {
        List <Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++){
            boolean inAns = true;
            List <Integer> buf = new ArrayList<>();
            for (int j = 0; j <= (r[i] - l[i]) / 2 - 1 + (r[i] - l[i])%2; buf.add(nums[l[i] + j]), buf.add(nums[r[i] - j]), j++);
            if ((l[i] + r[i]) % 2 == 0)
                buf.add(nums[(r[i] + l[i]) / 2]);
            Collections.sort(buf);
            for (int j = 1; j < buf.size(); j++)
                if (buf.get(j) - buf.get(j - 1) != buf.get(1) - buf.get(0)){
                    inAns = false;
                    break;
                }
            ans.add(inAns);
        }
        return ans;
    }
    @Override
    public List<Boolean> solution(Context context) {
        return solution((int[]) context.getContext()[0],(int[]) context.getContext()[1], (int[]) context.getContext()[2]);
    }
}
