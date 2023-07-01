package challenge1;

public class EvenSumOddSumDiff {
    /*
    Write a function that takes an array of integers as an argument and returns a value based on the sums of the even
    and odd numbers in the array. Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
    The function should return X – Y
    if input array is	return
    {1}	                1
    {1, 2}	            -1
    {1, 2, 3}	        2
    {1, 2, 3, 4}	    -2
    {3, 3, 4, 4}	    -2
    {3, 2, 3, 4}	    0
    {4, 1, 2, 3}	    -2
    {1, 1}	            2
    {}	                0
     */
    public static int findEvenSumOddSumDifference(int[] arr) {
        if (arr == null) return  0;

        int evenSum = 0;
        int oddSum = 0;
        for (int num : arr ) {
            if (num % 2 == 0) evenSum += num;
            else  oddSum += num;
        }

        return oddSum - evenSum;
    }
}
