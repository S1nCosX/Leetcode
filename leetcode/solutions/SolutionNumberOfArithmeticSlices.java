package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionNumberOfArithmeticSlices extends Solution {
    private long solution(int[] nums) {
        int ans = 0;
        for (int i = 0; i + 2 < nums.length;){
            int check = nums[i] - nums[i + 1];
            if (nums[i + 1] - nums[i + 2] == check){
                int cur = 0;
                int addition = 1;
                i += 2;
                while (i < nums.length && nums[i - 1] - nums[i] == check){
                    cur += addition++;
                    i++;
                }
                i--;
                ans += cur;
            }
            else
                i++;
        }
        return ans;
    }
    @Override
    public String solution(Context context) {
        try {
            return Long.valueOf(solution((int[]) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }
}
