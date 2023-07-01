package challenge1;

import java.util.ArrayList;

public class CommonElements {
    /*
    Write a function to return an array containing all elements common to two given arrays containing distinct positive
    integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.
    if input parameters are	        return
    {1, 8, 3, 2}, {4, 2, 6, 1}	    {1, 2}
    {1, 8, 3, 2, 6}, {2, 6, 1}	    {2, 6, 1}
    {1, 3, 7, 9}, {7, 1, 9, 3}	    {1, 3, 7, 9}
    {1, 2}, {3, 4}	                {}
    {}, {1, 2, 3}	                {}
    {1, 2}, {}	                    {}
    {1, 2}, null	                null
    null, {}	                    null
    null, null	                    null
     */
    public static int[] findCommonElements(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null ) return  null;
        if (arr1.length == 0 || arr2.length ==0 ) return  new int[] {};

        if (arr1.length <= arr2.length) return getCommonElements(arr1, arr2);
        else return getCommonElements(arr2, arr1);
    }

    private static int[] getCommonElements(int[] arr1, int[] arr2){
        var commonElements = new ArrayList<Integer>();
        for (int el1: arr1) {
            for (int el2: arr2) {
                if (el1 == el2) {
                    commonElements.add(el1);
                }
            }
        }

        int[] commonEleArray = new int[commonElements.size()];
        for (int i=0; i<commonEleArray.length; i++) {
            commonEleArray[i] = commonElements.get(i);
        }

        return commonEleArray;
    }
}
