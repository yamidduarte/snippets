
// Initialization
// Preservation
// Termination

public class Pearl {

        // recursive implementation of binary search
        // target = 29;
        //
        // array[i] =  16, 19, 21, 26, 27, 29, 33, 38, 42, 45, 49, 56, 58, 64, 68, 71;
        //      array[  0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15 ]
        //              L                           M                               R

    private int recursiveBinarySearch(int[] array, int searchValue, int left, int right) {
        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (searchValue == array[middle])
            return middle;
        if (searchValue < array[middle])
            return recursiveBinarySearch(array, searchValue, left,middle - 1);
        else {
            return recursiveBinarySearch(array, searchValue, middle + 1, right);
        }
    }
    
}
