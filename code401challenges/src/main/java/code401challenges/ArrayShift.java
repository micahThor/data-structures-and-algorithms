package code401challenges;

import java.net.SocketOption;

public class ArrayShift {

    public int[] insertShiftArray(int[] inputNumsArray, int inputNum) {

        // get place to insert new value
        int posToAdd = inputNumsArray.length / 2;

        // if length of array is odd number, add 1 to the position to insert
        if (inputNumsArray.length % 2 == 1) {
            posToAdd++;
        }

        // create new array with plus one space for new element
        int[] resultArray = new int[inputNumsArray.length + 1];

        // iterate through and populate new array with old values and input value
        for (int index = 0; index < resultArray.length; index++) {

                if (index < posToAdd) {
                    resultArray[index] = inputNumsArray[index];
                } else if (index == posToAdd) {
                    resultArray[index] = inputNum;
                } else {
                    resultArray[index] = inputNumsArray[index - 1];
                }
            }
        return resultArray;
    }
}