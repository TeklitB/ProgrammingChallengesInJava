package codility.iterations;

public class BinaryGap {
    //Time complexity O(log(n))
    public static int longestBinaryGap(int N){
        int longestBinaryGap = 0;
        int currentBinaryGap = -1;

        while (N != 0){
            if ((N & 1) == 1) {
                if (longestBinaryGap < currentBinaryGap){
                    longestBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            }
            else if (currentBinaryGap != -1) {
                currentBinaryGap++;
            }
            N = N >> 1;
        }
        return longestBinaryGap;
    }
}
