package leetcode.solutions;

import javafx.util.Pair;
import leetcode.Context;
import leetcode.Solution;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionMaxAreaOfIsland extends Solution {
    private int solution(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                int localAns = 0;
                if (grid[i][j] == 1){
                    Queue <Pair <Integer, Integer>> q = new LinkedList<>();
                    q.add(new Pair<>(i, j));
                    grid[i][j] = 0;
                    while (!q.isEmpty()){
                        localAns++;
                        Pair <Integer, Integer> local = q.remove();
                        Integer x = local.getKey();
                        Integer y = local.getValue();

                        if (x - 1 >= 0 && grid[x - 1][y] != 0){
                            q.add(new Pair<>(x - 1, y));
                            grid[x - 1][y] = 0;
                        }
                        if (y - 1 >= 0 && grid[x][y - 1] != 0) {
                            q.add(new Pair<>(x, y - 1));
                            grid[x][y - 1] = 0;
                        }
                        if (x + 1 < grid.length && grid[x + 1][y] != 0){
                            q.add(new Pair<>(x + 1, y));
                            grid[x + 1][y] = 0;
                        }
                        if (y + 1 < grid[x].length && grid[x][y + 1] != 0){
                            q.add(new Pair<>(x, y + 1));
                            grid[x][y + 1] = 0;
                        }
                    }
                    ans = Math.max(ans, localAns);
                }
            }
        }
        return ans;
    }

    @Override
    public Integer solution(Context context) {
        return solution((int[][]) context.getContext()[0]);
    }
}
