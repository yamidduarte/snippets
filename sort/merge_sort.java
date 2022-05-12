public class Sortfactory {

    private int[] array;
    // {15, 2, 6, 3, 9, 10, 4, 0, 13, 11, 7, 14, 5, 12, 1, 8}

    public int[] sort(int[] given) {
        array = given;
        split(array);
        return array;
    }

    private void split(int[] input) {
        if (input.length < 2) return;

        int leftLength = input.length/2;
        int rightLength = input.length - input.length/2;
        int[] leftHalf = new int[leftLength];
        int[] rightHalf = new int[rightLength];

        for (int i = 0; i < leftLength; i++)
            leftHalf[i] = input[i];

        for (int j = leftLength; j < input.length; j++)
            rightHalf[j - leftLength] = input[j];

        split(leftHalf);
        split(rightHalf);
        merge(leftHalf, rightHalf, input);
    };

    private void merge(int[] leftHalf, int[] rightHalf, int[] mergeArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j])
                mergeArray[k++] = leftHalf[i++];
            else
                mergeArray[k++] = rightHalf[j++];
        }
        while (i < leftHalf.length)
            mergeArray[k++] = leftHalf[i++];

        while (j < rightHalf.length)
            mergeArray[k++] = rightHalf[j++];
    }

}
