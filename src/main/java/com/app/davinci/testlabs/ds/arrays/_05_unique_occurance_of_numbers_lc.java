package com.app.davinci.testlabs.ds.arrays;

import java.util.*;

/**
 * Given an array of integers arr, return true if the number of
 * occurrences of each value in the array is unique or false otherwise.
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
 * No two values have the same number of occurrences.
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [1,2]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */

public class _05_unique_occurance_of_numbers_lc {
    public static void main(String[] args) {
        _05_unique_occurance_of_numbers_lc classIns = new _05_unique_occurance_of_numbers_lc();

        int[] arr = {1, 2, 1, 1, 3, 2};
        int[] arr1 = {1, 2};

        System.out.println(classIns.find(arr));
        System.out.println(classIns.find(arr1));
    }

    private boolean find(int[] arr) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int i : arr) {
            int ctr = 0;
            if (counterMap.containsKey(i)) {
                ctr = counterMap.get(i);
                counterMap.put(i, ++ctr);
            } else {
                counterMap.put(i, ++ctr);
            }
        }

        Set<Integer> unique = new HashSet<>();
        for (int i : counterMap.values()) {
            if (!unique.add(i)) return false;
        }
        return true;
    }
}
/* Solution accepted, identifier 1207. Unique Number of Occurrences */