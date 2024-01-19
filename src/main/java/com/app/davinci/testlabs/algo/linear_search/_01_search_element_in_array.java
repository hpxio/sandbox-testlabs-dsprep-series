package com.app.davinci.testlabs.algo.linear_search;

/***
 * Create a method search(int n, int[] arr) that finds
 * element 'n' in the array 'arr' using linear search
 */
public class _01_search_element_in_array {

    private static final int ENF = -1;

    public static void main(String[] args) {
        /*application starts from here. do not write any logic here */
        _01_search_element_in_array classIns = new _01_search_element_in_array();

        int[] arr = {7, 8, 2, 5, 0, 5, 1, 3};
        System.out.println("Length of the array : " + arr.length);

        /* when element is present in the array */
        System.out.println(classIns.search(5, arr));

        /* when element is not present in the array */
        System.out.println(classIns.search(6, arr));

        /* when element is the last element in the array */
        System.out.println(classIns.search(3, arr));

        /* when element is the first element in the array */
        System.out.println(classIns.search(7, arr));
    }

    /* using simple for-loop */
    private int search(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return ENF;
    }
}
