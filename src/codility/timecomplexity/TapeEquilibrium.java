package codility.timecomplexity;

public class TapeEquilibrium {
    /*
    A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
    Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
    A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
    The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
    In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
    For example, consider array A such that:
      A[0] = 3
      A[1] = 1
      A[2] = 2
      A[3] = 4
      A[4] = 3
    We can split this tape in four places:
        P = 1, difference = |3 − 10| = 7
        P = 2, difference = |4 − 9| = 5
        P = 3, difference = |6 − 7| = 1
        P = 4, difference = |10 − 3| = 7
    Hence, the function should return 1.
     */
    public static int findTapeEquilibriumMinimalDifference(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }

        int minDif = arr.length == 1 ? arr[0] : Integer.MAX_VALUE;
        int firstPartSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int secondPartSum = total - firstPartSum;
            int tempDiff = Math.abs(firstPartSum - secondPartSum);

            if (tempDiff < minDif) minDif = tempDiff;

            firstPartSum += arr[i];
        }

        return minDif;
    }
}
