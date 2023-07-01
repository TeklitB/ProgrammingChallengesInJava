package challenge1;

import java.util.Arrays;

public class PointOfEquilibrium {
    /*
    Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A,
    if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
    Write a function to return POE of an array, if it exists and -1 otherwise.
    if input arrays are	            return
    {1, 8, 3, 7, 10, 2}	            3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
    {1, 5, 3, 1, 1, 1, 1, 1, 1}	    2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
    {2, 1, 1, 1, 2, 1, 7}	        5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
    {1, 2, 3}	                    -1 Reason: No POE.
    {3, 4, 5, 10}	                -1 Reason: No POE.
    {1, 2, 10, 3, 4}	            -1 Reason: No POE.
     */
    public static int findPointOfEquilibrium(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int sum = 0;
        for (int el : arr) {
            sum += el;
        }

        int firstSum = 0, idx = -1;

        for (int i=0; i<arr.length; i++) {
            firstSum += arr[i];
            if (firstSum - arr[i] == (sum - firstSum)){
                idx = i;
                break;
            }
        }

        return idx;
    }
}
