package com.sks.array;


/**
 * @Author: Sandeep SIngh
 */

import java.util.Arrays;

/**
 * 1 2 3 4 5
 * k = 3
 * Step 1. Reverse the array elements from 0 to 2: 3 2 1 4 5
 * Step 2. Reverse the array elements from 3 to 4: 3 2 1 5 4
 * Step 3. Reverse the whole array: 4 5 1 2 3
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class RotateArray {

    public static void rotateArrayUsingReverse(int[] array, int k) {

        if (k < 0) {
            throw new IllegalArgumentException("k cannot be negative!");
        }

        if (array == null || array.length < 2) {
            return;
        }

        int n = array.length;
        if (k > n)
            k = k % n;

        reverseArray(array, 0, k - 1);
        reverseArray(array, k, n - 1);
        reverseArray(array, 0, n - 1);
    }

    /**
     * @param array
     * @param start
     * @param end   Reverse an array
     */
    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] array = {10, 12, 36, 94, 58};
        int k = 8;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));
        rotateArrayUsingReverse(array, k);
        System.out.println("After Rotation " + k + " times using reversal: ");
        System.out.println(Arrays.toString(array));
    }

}
