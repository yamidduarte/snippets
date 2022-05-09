// Initialization
// Preservation
// Termination

public class Pearl {

    public int eval(int searchValue, int[] array) {

        // iterative implementation of binary search
        // target = 29;
        //
        // array[i] =  16, 19, 21, 26, 27, 29, 33, 38, 42, 45, 49, 56, 58, 64, 68, 71;
        //      array[  0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15 ]
        //              L                           M                               R
        var leftBound = 0;
        var rightBound = array.length - 1;

        while (leftBound < rightBound) {
            var middleTarget = (leftBound + rightBound) / 2;
            if (searchValue == array[middleTarget])
                return middleTarget;
            if (searchValue < array[middleTarget])
                rightBound = middleTarget - 1;
            else
                leftBound = middleTarget + 1;
        }
        return -1;
    }
    
}
