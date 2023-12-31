package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionMatrixDiagonalSum extends Solution {
    private int solution(int[][]mat){
        int ans = 0;
        for (int i = 0; i < mat.length; i++){
            ans += mat[i][i];
            ans += (i != mat.length - 1 - i) ? mat[i][mat.length - 1 - i] : 0;
        }
        return ans;
    }
    @Override
    public Integer solution(Context context) {
        return solution((int[][]) context.getContext()[0]);
    }
}
