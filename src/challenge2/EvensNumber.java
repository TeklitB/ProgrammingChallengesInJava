package challenge2;

public class EvensNumber {
    /*
    An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.
     */
    public static int isEvens(int num ){

        while (num != 0) {
            if ((num % 10) % 2 != 0) return 0;
            num = num / 10;
        }

        return 1;
    }
}
