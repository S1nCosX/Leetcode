package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.*;

public class SolutionSum3 extends Solution {
    private List<List<Integer>> solution(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set <List<Integer>> ans = new HashSet<>();

        for (Integer i : nums)
            mp.put(i, mp.getOrDefault(i, 0) + 1);

        for (Integer i : mp.keySet()){
            mp.put(i, mp.get(i) - 1);
            for (Integer j : mp.keySet()) {
                if (!mp.get(j).equals(0)){
                    mp.put(j, mp.get(j) - 1);
                    if (mp.getOrDefault(-(i + j), 0) > 0) {
                        ans.add(Arrays.asList(i, j, -(i + j)));
                    }
                    mp.put(j, mp.get(j) + 1);
                }
            }
            mp.put(i, 0);
        }

        return new ArrayList<>(ans);
    }
    @Override
    public String solution(Context context) {
        try {
            return solution((int[]) context.getContext()[0]).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }
}
