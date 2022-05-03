package com.yamidduarte;

import java.util.Stack;

public class Solution {

     public int evaluate(String input) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            if (ch == ')' && !stack.isEmpty())
                stack.pop();
            if (ch == ')' && stack.isEmpty())
                count++;
        }
        return count + stack.size();
    }

}
