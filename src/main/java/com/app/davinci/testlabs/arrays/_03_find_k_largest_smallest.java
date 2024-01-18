package com.app.davinci.testlabs.arrays;

import com.app.davinci.testlabs.utils.ArrayUtils;

import java.util.Arrays;

/* Find the Kth largest and the Kth smallest number in an array.
 * Alternate, what if we want to know the index of the kth largest
 * and smallest numbers? Another question, for a given array of length
 * n and a number p, what is the kth position in the array?  */
public class _03_find_k_largest_smallest {
    public static void main(String[] args) {
        _03_find_k_largest_smallest classIns = new _03_find_k_largest_smallest();

        /* TODO: revisit later when max-heap & priority queue is completed */
        int[] arr = {3, 0, 8, 1, 9, 0, 1, 4, 2}; //edge-case, what if there are duplicates
        int[] arr1 = {3, 1, 0, 3, -1, -2}; //edge-case, what if k is larger than arr.length
        int[] arr2 = {0, 0, 0, 0, 0}; //edge-case, what if all values are same or zero
        int[] arr3 = {-5, 9, 8, 0, -2, -1, 3, 4}; //discrete values in array

        // classIns.find(2, arr);
        // classIns.find(7, arr1);
        // classIns.find(3, arr2);
        classIns.find(2, arr3);
        classIns.find(1, arr3);
    }

    /* case - this solution will only work if all elements are discrete */
    private void find(int k, int[] arr) {
        ArrayUtils.printArray(arr);
        int[] res = {0, 0};

        /* sort in ascending order, then return based on k */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        res[0] = arr[k - 1]; // kth smallest
        res[1] = arr[arr.length - k]; // kth largest
        ArrayUtils.printArray(res);
    }
}
