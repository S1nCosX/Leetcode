public class SolutionMatrixDiagonalSum {
    public static int Solution(int[][]mat){
        int ans = 0;
        for (int i = 0; i < mat.length; i++){
            ans += mat[i][i];
            ans += (i != mat.length - 1 - i) ? mat[i][mat.length - 1 - i] : 0;
        }
        return ans;
    }
}
