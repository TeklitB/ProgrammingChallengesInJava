package challenge1;

public class SubCharArray {
    /*
    Write a function that accepts a character array, a zero-based start position and a length.
    It should return a character array containing length characters starting with the start character of the input array.
    The function should do error checking on the start position and the length and return null if the either value is not legal.
    if input parameters are	    return
    {‘a’, ‘b’, ‘c’}, 0, 4	    null
    {‘a’, ‘b’, ‘c’}, 0, 3	    {‘a’, ‘b’, ‘c’}
    {‘a’, ‘b’, ‘c’}, 0, 2	    {‘a’, ‘b’}
    {‘a’, ‘b’, ‘c’}, 0, 1	    {‘a’}
    {‘a’, ‘b’, ‘c’}, 1, 3	    null
    {‘a’, ‘b’, ‘c’}, 1, 2	    {‘b’, ‘c’}
    {‘a’, ‘b’, ‘c’}, 1, 1	    {‘b’}
    {‘a’, ‘b’, ‘c’}, 2, 2	    null
    {‘a’, ‘b’, ‘c’}, 2, 1	    {‘c’}
    {‘a’, ‘b’, ‘c’}, 3, 1	    null
    {‘a’, ‘b’, ‘c’}, 1, 0	    {}
    {‘a’, ‘b’, ‘c’}, -1, 2	    null
    {‘a’, ‘b’, ‘c’}, -1, -2	    null
    {}, 0, 1	                null

     */
    public  static char[] getSubCharArray(char[] arr, int start, int len) {
        if (arr == null || arr.length == 0) return null;
        if (start < 0 || len < 0 || (start+len-1 >= arr.length)) return null;
        if ((start + len) > arr.length) return null;

        char[] subArray = new char[len];
        for (int i=start, j=0; i<(start + len); i++, j++) {
            subArray[j] = arr[i];
        }

        return subArray;
    }
}
