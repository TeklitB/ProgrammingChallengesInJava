package challenge3;

import java.util.ArrayList;

public class MinDistance {
    /*
    Write a function named minDistance that returns the smallest distance between two factors of a number.
    For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013. minDistance(13013)
    would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
    As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8 and the smallest distance
    between any two factors is 1 (2 – 1 = 1).
     */
    public static int minDistance(int n) {
        var factors = new ArrayList<Integer>();
        int minDis = Integer.MAX_VALUE;

        factors.add(1);
        for (int i = 2; i <= n; i++) {
            if (n%i==0 && i*i==n) return 0;

            if (n%i==0) {
                for (int factor : factors ) {
                    int diff = (factor - i) >= 0 ? (factor - i) : -1*(factor - i);
                    if (minDis > diff) minDis = diff;
                }

                factors.add(i);
            }
        }

        return minDis;
    }
}
