import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionCapture {
    static public void solve(char[][] board) {
        boolean[][] used = new boolean[board.length][board[0].length];

        for (int i = 1; i < board.length - 1; i++){
            for (int j = 1; j < board[i].length - 1; j++){
                if (board[i][j] == 'O' && !used[i][j]){
                    boolean comeBack = false;
                    Queue <Pair<Integer, Integer>> cbq = new LinkedList<>();

                    Queue <Pair<Integer, Integer>> q = new LinkedList<>();
                    q.add(new Pair<>(i, j));
                    board[i][j] = 'X';
                    while (!q.isEmpty()){
                        Pair <Integer, Integer> local = q.remove();
                        cbq.add(local);
                        Integer x = local.getKey();
                        Integer y = local.getValue();

                        if (x - 1 >= 0 && board[x - 1][y] != 'X'){
                            q.add(new Pair<>(x - 1, y));
                            board[x - 1][y] = 'X';
                            used[x - 1][y] = true;
                        }
                        else if (x - 1 < 0){
                            comeBack = true;
                            break;
                        }

                        if (y - 1 >= 0 && board[x][y - 1] != 'X') {
                            q.add(new Pair<>(x, y - 1));
                            board[x][y - 1] = 'X';
                            used[x][y - 1] = true;
                        }
                        else if (y - 1 < 0){
                            comeBack = true;
                            break;
                        }

                        if (x + 1 < board.length && board[x + 1][y] != 'X'){
                            q.add(new Pair<>(x + 1, y));
                            board[x + 1][y] = 'X';
                            used[x + 1][y] = true;
                        }
                        else if (x + 1 >= board.length){
                            comeBack = true;
                            break;
                        }

                        if (y + 1 < board[x].length && board[x][y + 1] != 'X'){
                            q.add(new Pair<>(x, y + 1));
                            board[x][y + 1] = 'X';
                            used[x][y + 1] = true;
                        }
                        else if (y + 1 >= board[i].length){
                            comeBack = true;
                            break;
                        }
                    }

                    if (comeBack){
                        while (!cbq.isEmpty()){
                            Pair <Integer, Integer> local = cbq.remove();
                            Integer x = local.getKey();
                            Integer y = local.getValue();
                            board[x][y] = 'O';
                        }
                        while (!q.isEmpty()){
                            Pair <Integer, Integer> local = q.remove();
                            Integer x = local.getKey();
                            Integer y = local.getValue();
                            board[x][y] = 'O';
                        }
                    }
                }
            }
        }

        for (char[] i : board)
            System.out.println(i);
    }
}
