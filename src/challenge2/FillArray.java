package challenge2;

public class FillArray {
    public static int[] fillArray(int[] arr, int k, int n) {
        if (arr == null || arr.length == 0 || arr.length < k) return new int[] {};
        if (k <= 0 || n <= 0 || n < k) return  null;

        int[] newArray = new int[n];
        int r = n % k, q = n / k;

        int m = 0;
        for (int i=1; i<=q; i++) {
            for (int j=0; j<k; j++) {
                newArray[m] = arr[j];
                m++;
            }
        }

        for (int i=0; i<r; i++) {
            newArray[m] = arr[i];
            m++;
        }

        return  newArray;
    }

    public static int[] fill(int[] arr, int k, int n) {
        if (arr == null || arr.length == 0 || arr.length < k) return new int[] {};
        if (k <= 0 || n <= 0 || n < k) return  null;

        int[] newArray = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (j < k) {
                newArray[i] = arr[j];
                j++;
            }
            else if (j == k) {
                j = 0;
                newArray[i] = arr[j];
                j++;
            }
        }

        return newArray;
    }
}
