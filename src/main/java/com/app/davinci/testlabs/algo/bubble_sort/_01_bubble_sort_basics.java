package com.app.davinci.testlabs.algo.bubble_sort;

import java.util.Arrays;

public class _01_bubble_sort_basics {
    public static void main(String[] args) {
        _01_bubble_sort_basics classIns = new _01_bubble_sort_basics();

        int[] arr = {2, 5, 1, 8, 0, 3, 4, 1};
        System.out.println(Arrays.toString(classIns.sort(arr)));

        int[] arr1 = new int[0];
        System.out.println(Arrays.toString(classIns.sort(arr1)));

        /* edge case - what if the array is already sorted?
         * optimize base implementation to avoid space/time wastage */
        int[] arr2 = {1, 2, 3, 3, 4, 5, 5, 6};
        System.out.println(Arrays.toString(classIns.sortOptimize(arr2)));

        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(classIns.sortOptimize(arr3)));
    }

    private int[] sort(int[] arr) {
        if (0 == arr.length) return null;

        int len = arr.length;
        for (int i = 0; i < len; i++) { // iterate over the list
            for (int j = 0; j < (len - i - 1); j++) { // iterate over the elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private int[] sortOptimize(int[] arr) {
        if (0 == arr.length) return null;
        boolean swapped = false;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (len - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            /*System.out.println("Array sorted? " + !swapped);*/
            if (!swapped) break;
        }
        return arr;
    }
}
