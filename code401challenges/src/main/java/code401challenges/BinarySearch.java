package code401challenges;

public class BinarySearch {

    public int BinarySearch(int[] inputArray, int key) {

        // initialized to no search results
        int missedTargetIndex = -1;

        // specifies the beginning of the search range
        int headOfRange = 0;

        // specifies the ending of the search range
        int tailOfRange = inputArray.length - 1;

        // search while head of range doesn't catch up to tail
        while (headOfRange <= tailOfRange) {

            int midPointTarget;

            // handles cases for even/odd length input arrays
            if (inputArray.length % 2 == 0) {
                midPointTarget = (headOfRange + (tailOfRange - 1)) / 2;
            } else {
                midPointTarget = (headOfRange + tailOfRange) / 2;
            }

            if (inputArray[midPointTarget] == key) {
                return midPointTarget;
            } else if (inputArray[midPointTarget] < key) {
                headOfRange = midPointTarget + 1;
            } else {
                tailOfRange = midPointTarget - 1;
            }
        }

        return missedTargetIndex;
    }
}

