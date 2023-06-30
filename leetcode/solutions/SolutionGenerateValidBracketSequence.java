package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.*;

public class SolutionGenerateValidBracketSequence extends Solution {

    private List<String> generate(int i, int n, String s){
        List <String> ans = new ArrayList<>();
        if (i < n){
            ans.addAll(generate(i + 1, n, s + "("));
            ans.addAll(generate(i + 1, n, s + ")"));
        }
        else{
            Stack <Character> st = new Stack<>();
            for (int j = 0; j < n; j++){
                if (s.charAt(j) == '(')
                    st.push(s.charAt(j));
                else
                    if (!st.isEmpty() && st.peek() == '(')
                        st.pop();
                    else
                        st.push(s.charAt(j));
            }
            if (st.isEmpty())
                ans.add(s);
        }
        return ans;
    }
    private List<String> solution(int n) {
        return generate(0, n*2, "");
    }
    @Override
    public List<String> solution(Context context) {
        return solution((int) context.getContext()[0]);
    }
}
