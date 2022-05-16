package com.yamidduarte

class Sort {
  private array;
  public int[] sort(int[] input) {
    array = input;
    split(array);
    return array;
  }
  private void split(int[] input) {
    if (input.length < 2) return;
    int[] left = int[input.length/2];
    int[] right = int[input.length - input.length/2];
    for (int i = 0; i < input.length/2; i++)
      left[i] = input[i];
    for (int j = input.length/2; j < input.length; j++)
      right[j - input.length/2] = input[j];
    split(left);
    split(right);
    merge(left, right, input);
  }
  private void merge(int[] left, int[] right, int[] merge) {
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length)
      if (left[i] <= right[j])
        merge[k++] = left[i++];
    while (i < left.length)
      merge[k++] = left[i++];
    while (j < right.length)
      merge[k++] = right[j++];
  }
}
