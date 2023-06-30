package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionTwoSum extends Solution {
    private int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] pair = {i, j};
                    return pair;
                }
            }
        }
        int[] pair = {0, 0};
        return pair;
    }
    @Override
    public String solution(Context context) {
        try {
            return solution((int[]) context.getContext()[0], (int) context.getContext()[1]).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }
}
