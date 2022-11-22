package org.example.Stack;

public class maxDepth {
    public int maxdepth(String s) {
        if(s=="("||s==")")return 0;//not valid parenthesis string
        int depth = 0;
        int max = 0;
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                depth++;
            } else if(s.charAt(i) == ')') {
                depth--;
            }
            max = depth > max ? depth : max;
        }

        return max;
    }
}
