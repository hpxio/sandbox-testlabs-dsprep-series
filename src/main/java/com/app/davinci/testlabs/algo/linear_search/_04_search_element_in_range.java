package com.app.davinci.testlabs.algo.linear_search;

/***
 * Create a method search(int n, int[] arr) that finds
 * element 'n' in the array 'arr' using linear search
 */
public class _04_search_element_in_range {

    public static void main(String[] args) {
        /*application starts from here. do not write any logic here */
        _04_search_element_in_range classIns = new _04_search_element_in_range();

        int[] arr = {9, 7, 8, 0, 2, 0, 5, 6};
        System.out.println(classIns.search(0, 2, 5, arr)); // valid
        System.out.println(classIns.search(2, 1, 4, arr)); // invalid
        System.out.println(classIns.search(8, 0, 2, arr));  // at the end
        System.out.println(classIns.search(8, 2, 4, arr));  // at the start
        System.out.println(classIns.search(8, 2, -1, arr)); // edge-case
        System.out.println(classIns.search(8, -2, -1, arr)); // edge-case
    }

    private boolean search(int n, int start, int end, int[] arr) {
        if (start < 0 || start > end) return false;
        for (int i = start; i <= end; i++) {
            if (n == arr[i]) return true;
        }
        return false;
    }
}
