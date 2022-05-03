package com.yamidduarte;

import java.util.Stack;

public class Solution {

     public int evaluate(String input) {

         Stack<Character> openedStack = new Stack<>();
         int closedCount = 0;

         for (char ch : input.toCharArray()) {
             if (ch == '(')
                 openedStack.push(ch);
             if (ch == ')') {
                 if (!openedStack.isEmpty())
                     openedStack.pop();
                 else
                     closedCount++;
             }
         }
         return closedCount + openedStack.size();
    }
}
