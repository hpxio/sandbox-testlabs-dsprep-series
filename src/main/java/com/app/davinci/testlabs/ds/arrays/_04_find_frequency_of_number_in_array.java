package com.app.davinci.testlabs.ds.arrays;

/* Find the frequency of a number n in an
 * array arr of length l */
public class _04_find_frequency_of_number_in_array {

    public static void main(String[] args) {
        _04_find_frequency_of_number_in_array classIns = new _04_find_frequency_of_number_in_array();

        int[] arr = {-2, 8, 3, -1, -1, -2, -4, 4, -5, -6, -1, 1};
        System.out.println(classIns.find(-1, arr));
    }

    private int find(int n, int[] arr) {
        if (0 == arr.length) return -1;

        int ctr = 0;
        for (int j : arr) {
            if (n == j) ctr++;
        }
        return ctr;
    }
}
