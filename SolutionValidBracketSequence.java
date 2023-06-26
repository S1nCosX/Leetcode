import java.util.Stack;

public class SolutionValidBracketSequence {
    static public boolean Solution(String s) {
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
}

