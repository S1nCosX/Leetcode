import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionSum3 {
    static public List<List<Integer>> threeSum(int[] nums) {
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
}
