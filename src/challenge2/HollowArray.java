package challenge2;

public class HollowArray {
    /*
    An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and followed by the
    same number of non-zero elements. Write a function named isHollow that accepts an integer array and returns 1 if
    it is a hollow array, otherwise it returns 0.
    Examples: isHollow({1,2,4,0,0,0,4,5}) returns 1. isHollow ({1,2,0,0,0,3,4,5}) returns 0.
    isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0. isHollow ({1,2, 0,0, 3,4}) returns 0.
     */
    public static int isHollow(int[] arr) {
        if (arr == null || arr.length < 5) return 0;

        int preceding = 0, countZero = 0, following = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && countZero == 0) {
                countZero++;
                preceding = arr[i-1];
            }
            else if (arr[i] == 0 && countZero > 0) {
                countZero++;
            }
            else if (arr[i] != 0 && countZero >= 3) {
                following = arr[i];
                break;
            }
            else if (arr[i] != 0 && countZero < 3) {
                countZero = 0;
                preceding = 0;
            }
        }

        if (preceding != 0 && preceding == following) return 1;

        return 0;
    }
}
