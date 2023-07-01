package challenge2;

public class CompleteArray {
    /*
    An array is defined to be complete if the conditions (a), (d) and (e) below hold.
        a. The array contains even numbers
        b. Let min be the smallest even number in the array.
        c. Let max be the largest even number in the array.
        d. min does not equal max
        e. All numbers between min and max are in the array
    For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
        a. The array contains even numbers
        b. 2 is the smallest even number
        c. 8 is the largest even number
        d. 2 does not equal 8
        e. the numbers 3, 4, 5, 6, 7 are in the array.
    Examples of arrays that are not complete are:
       a. {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
       b. {2, 2} condition (d) does not hold
       c. {2, 6, 3, 4} condition (e) does not hold (5 is missing)
     */
    public static int isComplete (int[ ] arr) {
        if (arr == null || arr.length <= 1) return 0;

        int countEven = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int n : arr ) {
            if (n % 2 == 0) countEven++;
            if ( n > max && n % 2 == 0) max = n;
            if (n < min && n % 2 == 0) min = n;
        }

        if (max == Integer.MIN_VALUE) return 0;
        if (countEven == 0 || min == max) return 0;

        boolean isFound = false;
        int allOccured = 0, count=0;
        for(int i=min+1; i<max; i++){
            isFound = false;
            for (int n : arr) {
                if (n == i){
                    allOccured++;
                    isFound = true;
                    break;
                }
            }
             if (!isFound) break;;

            count++;
        }

        if (!isFound) return 0;

        if (allOccured == count) return 1;

        return 0;
    }
}
