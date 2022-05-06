package com.yamidduarte;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String testCase0 = "";      // 0
        String testCase1 = "a";     // 1
        String testCase2 = "ab";    // 2
        String testCase3 = "aa";    // 1
        String testCase4 = "aba";   // 2
        String testCase5 = "aaa";   // 1
        String testCase6 = "aab";   // 2
        String testCase7 = "abc";   // 3
        String testCase8 = "abca";  // 3
        String testCase9 = "abcda"; // 4

        Solution testSuite = new Solution();

        System.out.println(testSuite.evaluate(testCase9));

    }

}
