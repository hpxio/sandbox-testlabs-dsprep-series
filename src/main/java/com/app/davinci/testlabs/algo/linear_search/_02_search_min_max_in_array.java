package com.app.davinci.testlabs.algo.linear_search;

/***
 * Create a method search(int n, int[] arr) that finds
 * element 'n' in the array 'arr' using linear search
 */
public class _02_search_min_max_in_array {

    private static final int ENF = Integer.MIN_VALUE;

    public static void main(String[] args) {
        /*application starts from here. do not write any logic here */
        _02_search_min_max_in_array classIns = new _02_search_min_max_in_array();

        /* when all elements are positive numbers */
        int[] arr = new int[]{2, 5, 6, 2, 0};
        classIns.execute(arr);

        /* when all elements are negative numbers */
        arr = new int[]{-2, -5, -6, -8, -1};
        classIns.execute(arr);

        /* when there are zeros in the array */
        arr = new int[]{2, -5, 0, 8, -1, 0};
        classIns.execute(arr);

        /* when first element is the smallest */
        arr = new int[]{-2, 5, 6, 0, 2};
        classIns.execute(arr);

        /* when last element is the smallest */
        arr = new int[]{2, -2, -1, -5};
        classIns.execute(arr);
    }

    private int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    private int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    private void display(int[] arr) {
        for (int i : arr) System.out.print("[" + i + "] ");
    }

    private void execute(int[] arr) {
        display(arr);
        System.out.println(" | Min: " + minimum(arr) + " | Max: " + maximum(arr));
    }
}
