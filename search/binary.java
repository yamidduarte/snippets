public class Searchfactory {

    public int find(int term, int[] input) {
        //return findIteratively(term, input);
        return findRecursively(term, input, 0, input.length - 1);
    }

    private int findIteratively(int term, int[] input) {
        var left = 0;
        var right = input.length - 1;

        for (int i = 0; i < input.length; i++) {
            var middle = (left + right) / 2;
            if (term == input[middle])
                return middle;
            if (term < input[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    private int findRecursively(int term, int[] input, int left, int right) {
        int middle = (left + right) / 2;

        if (right < left)
            return -1;

        if (term == input[middle])
            return middle;

        if (term < input[middle])
            return findRecursively(term, input, left, middle - 1);

        return findRecursively(term, input, middle + 1, right);
    }

}
