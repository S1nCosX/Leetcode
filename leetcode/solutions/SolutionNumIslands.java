package leetcode.solutions;

import javafx.util.Pair;
import leetcode.Context;
import leetcode.Solution;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionNumIslands extends Solution {
    private int solution(char[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    Queue<Pair<Integer, Integer>> q = new LinkedList<>();
                    q.add(new Pair<>(i, j));
                    grid[i][j] = '0';
                    while (!q.isEmpty()){
                        Pair <Integer, Integer> local = q.remove();
                        Integer x = local.getKey();
                        Integer y = local.getValue();

                        if (x - 1 >= 0 && grid[x - 1][y] != '0'){
                            q.add(new Pair<>(x - 1, y));
                            grid[x - 1][y] = '0';
                        }
                        if (y - 1 >= 0 && grid[x][y - 1] != '0') {
                            q.add(new Pair<>(x, y - 1));
                            grid[x][y - 1] = '0';
                        }
                        if (x + 1 < grid.length && grid[x + 1][y] != '0'){
                            q.add(new Pair<>(x + 1, y));
                            grid[x + 1][y] = '0';
                        }
                        if (y + 1 < grid[x].length && grid[x][y + 1] != '0'){
                            q.add(new Pair<>(x, y + 1));
                            grid[x][y + 1] = '0';
                        }
                    }
                }
            }
        }
        return ans;
    }
    @Override
    public String solution(Context context) {
        try {
            return Integer.valueOf(solution((char[][]) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }

}
