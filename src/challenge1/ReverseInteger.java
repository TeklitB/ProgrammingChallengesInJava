package challenge1;

public class ReverseInteger {
    /*
    Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
    if the input integer is	    return
    1234	                    4321
    12005	                    50021
    1	                        1
    1000	                    1
    0	                        0
    -12345	                    -54321
     */
    public static int  reverseInteger(int num){

        int keepSign = 1;
        if (num < 0) {
            num = num * -1;
            keepSign = -1;
        }

        int reversedNum = 0;
        while(num >= 10 ){
            int rem = num % 10;
            num = num / 10;
            reversedNum += rem;
            reversedNum = reversedNum * 10;
        }
        reversedNum += num;

        return  reversedNum * keepSign;
    }
}
