package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

import java.util.Stack;

public class SolutionValidBracketSequence extends Solution {
    private boolean solution(String s) {
        Stack <Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '[')
                st.push('[');
            if (s.charAt(i) == '{')
                st.push('{');
            if (s.charAt(i) == '(')
                st.push('(');

            if (s.charAt(i) == ']'){
                if (!st.isEmpty() && st.peek().equals('['))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')'){
                if (!st.isEmpty() && st.peek().equals('('))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
            if (s.charAt(i) == '}'){
                if (!st.isEmpty() && st.peek().equals('{'))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
    }
    @Override
    public Boolean solution(Context context) {
        return solution((String) context.getContext()[0]);
    }
}

