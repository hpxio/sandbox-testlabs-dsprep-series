package com.app.davinci.testlabs.algo.linear_search;

/***
 * Create a method search(int n, int[] arr) that finds
 * element 'n' in the array 'arr' using linear search
 */
public class _05_search_element_divisible_by_n {

    private static final int ENF = Integer.MIN_VALUE;

    public static void main(String[] args) {
        /*application starts from here. do not write any logic here */
        _05_search_element_divisible_by_n classIns = new _05_search_element_divisible_by_n();

        int[] arr = {9, 7, 8, 0, 2, 0, 5, 6};
        System.out.println(classIns.search(3, arr));
        System.out.println(classIns.search(25, arr));

        arr = new int[]{9, 7, 8, 36, 5, 6};
        System.out.println(classIns.search(6, arr));
        System.out.println(classIns.search(0, arr));

        arr = new int[]{9, 7, -8, 36, 5, 6}; // edge-case
        System.out.println(classIns.search(2, arr));
    }

    private int search(int n, int[] arr) {
        if (n <= 0) return ENF;
        for (int num : arr) {
            if ((num != 0) && (num % n == 0)) return num;
        }
        return ENF;
    }
}
