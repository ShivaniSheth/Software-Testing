package org.example.Stack;

public class maxDepth {
    public int maxdepth(String s) {

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
