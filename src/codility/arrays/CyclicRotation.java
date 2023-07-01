package codility.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CyclicRotation {
    public static int[] cyclicRotationArrayByK(int[] A, int K){
        if (A == null || A.length == 0)
            return A;

        K = K % A.length;
        if(K == 0)
            return A;
        else {
            int[] B = new int[A.length];
            for(int i=0; i<A.length; i++){
                int j = (i + K) % A.length;
                B[j] = A[i];
            }

            return B;
        }
    }

    public static String toString(int[] array) {
        return Arrays.stream(array)
                .mapToObj(i -> String.format("%d", i))
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
