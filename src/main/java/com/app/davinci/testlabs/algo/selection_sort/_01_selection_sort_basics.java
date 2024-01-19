package com.app.davinci.testlabs.algo.selection_sort;

import java.util.Arrays;

public class _01_selection_sort_basics {
    public static void main(String[] args) {
        _01_selection_sort_basics classIns = new _01_selection_sort_basics();

        int[] arr = {3, 7, 1, 0, 4, 7, 1, 8, 1, 2, 5};
        System.out.println(Arrays.toString(classIns.sort(arr)));

        int[] arr1 = {0, 0, 0, 0, -1, -2, -1, -1, -1, 0, 2, -2};
        System.out.println(Arrays.toString(classIns.sort(arr1)));

        char[] arr2 = {'t', 'e', 's', 't', 'd', 'a', 't', 'a'};
        System.out.println(Arrays.toString(classIns.sort(arr2)));
    }

    private int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private char[] sort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
