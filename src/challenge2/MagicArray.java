package challenge2;

public class MagicArray {
    /*
    An array is defined to be a Magic array if the sum of the primes in the array is equal to the first element of the array.
    If there are no primes in the array, the first element must be 0.
    So {21, 3, 7, 9, 11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the first element of the array.
    {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 which is also the first element.
    Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}.
    {0} is not a Magic array because the sum of the primes is 5+5+3 = 13.
    Note that -5 is not a prime because prime numbers are positive.
     */
    public static int isMagicArray(int[] arr) {
        if (arr == null || arr.length == 0) return  0;

        if (arr[0] == 0) return 1;

        int primeSum = 0;
        for (int n : arr ) {
            if (n > 1) {
                boolean isPrime = true;
                for (int i=2; i<n; i++) {
                    if (n%i==0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) primeSum +=n;
            }
        }

        if (primeSum == arr[0]) return 1;

        return 0;
    }
}
