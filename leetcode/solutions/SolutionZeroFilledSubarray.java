package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionZeroFilledSubarray extends Solution {

    private long solution(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++){
            long cur = 0;
            long addition = 1;
            while (i < nums.length && nums[i] == 0){
                cur += addition++;
                i++;
            }
            ans += cur;
        }
        return ans;
    }
    @Override
    public Long solution(Context context) {
        return solution((int[]) context.getContext()[0]);
    }
}
