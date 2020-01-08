package code401challenges;

import java.net.SocketOption;

public class ArrayShift {

    public int[] insertShiftArray(int[] inputNumsArray, int inputNum) {

        int posToAdd = inputNumsArray.length / 2;

        int[] resultArray = new int[inputNumsArray.length + 1];

        for (int index = 0; index < resultArray.length; index++) {

            if (inputNumsArray.length % 2 == 0) {

                // handles cases where input array length is an even number
                if (index < posToAdd) {
                    resultArray[index] = inputNumsArray[index];
                } else if (index == posToAdd) {
                    resultArray[index] = inputNum;
                } else {
                    resultArray[index] = inputNumsArray[index - 1];
                }

            } else {

                // handles cases where input array length is an odd number
                if (index < posToAdd + 1) {
                    resultArray[index] = inputNumsArray[index];
                } else if (index == posToAdd + 1) {
                    resultArray[index] = inputNum;
                } else {
                    resultArray[index] = inputNumsArray[index - 1];
                }
            }
        }

        return resultArray;
    }
}