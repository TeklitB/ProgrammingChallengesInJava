package codility.timecomplexity;

public class MissingElement {
    /*
    An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
    which means that exactly one element is missing. Your goal is to find that missing element.
    For example, given array A such that:
      A[0] = 2
      A[1] = 3
      A[2] = 1
      A[3] = 5
    the function should return 4, as it is the missing element.
     */
    public static int findMissingElement(int[] arr) {
        if (arr.length == 0) return  1;
        long len = arr.length + 1;

        long total = len * (len + 1) / 2, sum = 0;

        for (int n : arr) {
            sum += n;
        }

        return (int) (total - sum);
    }
}
