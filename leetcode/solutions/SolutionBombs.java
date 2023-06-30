package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionBombs extends Solution {
    int x = 0, y = 1, r = 2;
    boolean isIn(double[] exploded, double[] target){
        if (Math.pow((target[x]-exploded[x]), 2) + Math.pow((target[y]-exploded[y]), 2) <= Math.pow(exploded[r], 2))
            return true;
        return false;
    }

    int dfs(int i, List<List<Integer>> v, List used){
        if (used.get(i).equals(1))
            return 0;
        used.set(i, 1);
        int ans = 1;
        for (int j = 0; j < v.get(i).size(); j++)
            ans += dfs((int) v.get(i).get(j), v, used);
        return ans;
    }

    private int solution(int[][] bombs) {
        int ans = 0;

        List <List <Integer>> v = new ArrayList<>();

        for (int i = 0; i < bombs.length; i++){
            List <Integer> cur = new ArrayList<>();
            for (int j =0; j < bombs.length; j++){
                double[] exploided = {(double) bombs[i][x],(double) bombs[i][y], (double) bombs[i][r]};
                double[] target = {(double) bombs[j][x],(double) bombs[j][y], (double) bombs[j][r]};
                if (i != j && isIn(exploided, target))
                    cur.add(j);
            }
            v.add(cur);
        }

        for (int i = 0; i < bombs.length; i++)
            ans = Math.max(ans, dfs(i, v, Stream
                    .generate(()->0)
                    .limit(bombs.length)
                    .collect(Collectors.toList())));

        return ans;
    }

    @Override
    public String solution(Context context) {
        try {
            return Integer.valueOf(solution((int[][]) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }
}