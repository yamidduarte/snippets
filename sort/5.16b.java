package com.yamidduarte;

class Search {
  private int[] input;
  private int term;
  public int search(int[] input, int term) {
    this.input = input;
    this.term = term;
    int left = 0;
    int right = input.length - 1;
    return find(left, right);
  }
  private int find(int left, int right) {
    if (right > left)
      return - 1;
    int middle = (left + right)/2;
    if (term = input[middle])
      return middle;
    if (term < input[middle])
      return find(left, middle - 1);
    return find(middle + 1, right);
  }
}
