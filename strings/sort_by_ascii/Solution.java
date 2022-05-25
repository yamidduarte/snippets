package com.yamidduarte;

public class Solution {

    char[] array;

    public void printSorted(String input) {
        sortChars(input);
        printChars();
    }

    private void sortChars(String input) {
        array = input.toCharArray();
        split(array);
    }

    private void split(char[] arrayToSplit) {
        if(arrayToSplit.length < 2) return;

        int lengthLeftHalf = arrayToSplit.length/2;
        int lengthRightHalf = arrayToSplit.length - arrayToSplit.length/2;
        char[] leftHalf = new char[lengthLeftHalf];
        char[] rightHalf = new char[lengthRightHalf];

        for (int i = 0; i < lengthLeftHalf; i++)
            leftHalf[i] = arrayToSplit[i];

        for (int j = lengthLeftHalf; j < arrayToSplit.length; j++)
            rightHalf[j - lengthLeftHalf] = arrayToSplit[j];

        split(leftHalf);
        split(rightHalf);
        merge(arrayToSplit, leftHalf, rightHalf);
    }

    private void merge(char[] joinedArray, char[] leftHalf, char[] rightHalf) {
        int lengthLeftHalf = joinedArray.length/2;
        int lengthRightHalf = joinedArray.length - joinedArray.length/2;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lengthLeftHalf && j < lengthRightHalf) {
            if ((int) leftHalf[i] <= (int) rightHalf[j])
                joinedArray[k++] = leftHalf[i++];
            else
                joinedArray[k++] = rightHalf[j++];
        }

        while (i < lengthLeftHalf)
            joinedArray[k++] = leftHalf[i++];

        while (j < lengthRightHalf)
            joinedArray[k++] = rightHalf[j++];
    }

    private void printChars() {
        
        StringBuilder printOutput = new StringBuilder();
        for (char ch : array)
            printOutput.append(ch);
        System.out.println(printOutput);
        
    }

}
