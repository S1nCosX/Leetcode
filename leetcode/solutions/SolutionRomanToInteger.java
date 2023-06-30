package leetcode.solutions;

import leetcode.Context;
import leetcode.Solution;

public class SolutionRomanToInteger extends Solution {
    public static int solution(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    if (i + 1 < s.length()){
                        if(s.charAt(i+1) =='V'){
                            ans += 4;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'X'){
                            ans += 9;
                            i++;
                        }
                        else
                            ans += 1;
                    }
                    else
                        ans += 1;
                    break;

                case 'V':
                    ans += 5;
                    break;

                case 'X':
                    if (i + 1 < s.length()){
                        if(s.charAt(i+1) == 'L'){
                            ans += 40;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'C'){
                            ans += 90;
                            i++;
                        }
                        else
                            ans += 10;
                    }
                    else
                        ans += 10;
                    break;

                case 'L':
                    ans += 50;
                    break;

                case 'C':
                    if (i + 1 < s.length()){
                        if(s.charAt(i+1) == 'D'){
                            ans += 400;
                            i++;
                        }
                        else if (s.charAt(i+1) == 'M'){
                            ans += 900;
                            i++;
                        }
                        else
                            ans += 100;
                    }
                    else
                        ans += 100;
                    break;

                case 'D':
                    ans += 500;
                    break;

                case 'M':
                    ans += 1000;
                    break;
            }
        }
        return ans;
    }
    @Override
    public String solution(Context context) {
        try {
            return Integer.valueOf(solution((String) context.getContext()[0])).toString();
        }catch (ClassCastException e){
            return e.getMessage();
        }
    }

}
