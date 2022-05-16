package com.yamidduarte;

class Search {
  public int search(int[] input, int term) {
    // binary search, iterative implementation
    leftPointer = 0;
    rightPointer = input.length - 1;
    for (int i = 0; i < input.length; i++) {
      middlePointer = input.length/2;
      if (term = input[middlePointer])
        return middlePointer;
      if (term < input[middlePointer])
        rightPointer = middlePointer - 1;
      else
        leftPointer = middlePointer + 1;
    }
    return -1;
  }
}
