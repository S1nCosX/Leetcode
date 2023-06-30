package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionProvinces extends Solution {
    private void dfs(int i, int[][] isConnected, List<Boolean> used){
        if(used.get(i))
            return;
        used.set(i, (Boolean) true);
        for (int j = 0; j < isConnected.length; j++){
            if (isConnected[i][j] == 1)
                dfs(j, isConnected, used);
        }
    }
    private int solution(int[][] isConnected) {
        int ans = 0;

        List<Boolean> used = Stream.generate(() -> false)
                .limit(isConnected.length)
                .collect(Collectors.toList());

        for (int i = 0; i < isConnected.length; i++) {
            if (!used.get(i)) {
                dfs(i, isConnected, used);
                ans++;
            }
        }
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
