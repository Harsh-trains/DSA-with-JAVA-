package com.kunal;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // First, find the range
        int start = 0;
        int end = 1;

        // Condition for the target to lie in the range
        while (end < arr.length && target > arr[end]) {
            int temp = end + 1; // This is the new start
            // Double the box value
            end = end + (end - start + 1) * 2;
            // Adjust `end` if it exceeds the array length
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Answer found
                return mid;
            }
        }
        return -1;
    }
}
