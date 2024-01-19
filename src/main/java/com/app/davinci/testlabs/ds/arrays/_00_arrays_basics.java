package com.app.davinci.testlabs.ds.arrays;

public class _00_arrays_basics {
    public static void main(String[] args) {
        _00_arrays_basics classIns = new _00_arrays_basics();

        /* int[] arr = {1, 2, 3, 4}; // valid */

        /*int[] arr = {}; valid declaration, but size of array is 0
         * So inserting in this will result in IOB Exception */

        /* int[] arr = {};
        System.out.println(arr.length);
        System.out.println(arr[0]); */

        int[] arr1 = new int[5]; //valid
        int[] arr2 = {1, 2, 3, 4, 5}; //valid
        int[] arr3 = new int[]{1, 2, 3, 4, 5}; // valid

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
    }
}
