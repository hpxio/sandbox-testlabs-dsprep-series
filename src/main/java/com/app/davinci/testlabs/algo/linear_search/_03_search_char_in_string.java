package com.app.davinci.testlabs.algo.linear_search;

/***
 * Create a method search(int n, int[] arr) that finds
 * element 'n' in the array 'arr' using linear search
 */
public class _03_search_char_in_string {

    private static final int ENF = Integer.MIN_VALUE;

    public static void main(String[] args) {
        /*application starts from here. do not write any logic here */
        _03_search_char_in_string classIns = new _03_search_char_in_string();

        System.out.println(classIns.find('h', "harsh"));
        System.out.println(classIns.find('h', "ajay"));
        System.out.println(classIns.find('h', ""));

        classIns.printArray(classIns.findAll('o', "colonel"));
        classIns.printArray(classIns.findAll('o', "poor"));
        classIns.printArray(classIns.findAll('o', "handling"));
    }

    private boolean find(char e, String input) {
        for (char c : input.toCharArray()) if (c == e) return true;
        return false;
    }

    private int[] findAll(char e, String input) {
        int ctr = 0;
        int[] pos = new int[input.length()]; // find space optimization

        for (int i = 0; i < input.length(); i++) {
            if (e == input.charAt(i)) {
                pos[ctr++] = i;
            }
        }
        return pos;
    }

    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
