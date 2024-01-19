package com.app.davinci.testlabs.ds.arrays;

public class _01_reverse_1d_array {
    public static void main(String[] args) {
        /* this is the start if the program, do not write logics here */
        _01_reverse_1d_array classIns = new _01_reverse_1d_array();

        int[] arr = {1, 2, 3, 4, 5, 6};
        classIns.printArray(classIns.reverse(arr));

        arr = new int[]{};
        classIns.printArray(classIns.reverse(arr));
    }

    /* Option-1 : iterate and put all element in new array in reverse order */
    private int[] reverse(int[] arr) {
        if (arr.length == 0) return new int[]{0};

        int len = arr.length - 1;
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[len--] = arr[i];
        }
        return rev;
    }

    private void printArray(int[] arr) {
        for (int i : arr) System.out.print("[" + i + "] ");
    }
}
