package codility.arrays;

import java.util.HashMap;

public class OddOccurrencesInArray {
    /*
        Time complexity: O(N) or O(N*log(N))
     */
    public static int findUnpairedElement(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        int oddElement = -1;
        for (int el: A ) {
            map.merge(el, 1, Integer::sum);
        }

        for (int k: map.keySet()) {
            if (map.get(k) % 2 != 0)
                oddElement = k;
        }

        return oddElement;
    }
}
