package com.yamidduarte;

// Recent Meta question (5.2.22)

public class Main {

    public static void main(String[] args) {
        String testCase0 = "))((";
        String testCase1 = "()()()";
        String testCase2 = "(((())))";
        String testCase3 = "((()(()))()))))))))";
        String testCase4 = "(([1] + <2>))[a]";
        Solution testSuite = new Solution();
        System.out.println(testSuite.evaluate(testCase3));
    }
  
}
