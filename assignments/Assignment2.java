import java.util.Scanner;

public class BasicDSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Find Maximum Element in an Array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Minimum element: " + findMin(arr));

        // 2. Reverse an Array
        System.out.println("Reversed array: ");
        reverseArray(arr);
        printArray(arr);

        // 3. Check if the Array is Sorted
        System.out.println("Is the array sorted? " + isSorted(arr));

        // 4. Find Second Largest Element
        System.out.println("Second largest element: " + findSecondLargest(arr));

        // 5. Check if a Number is Prime
        System.out.print("Enter a number to check if prime: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));

        // 6. Find Factorial of a Number
        System.out.print("Enter a number to find factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial of " + factNum + " is " + factorial(factNum));

        // 7. Find GCD of Two Numbers
        System.out.print("Enter two numbers to find GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));

        // 8. Binary Search on a Sorted Array
        System.out.print("Enter element to search using Binary Search: ");
        int key = sc.nextInt();
        System.out.println("Element found at index: " + binarySearch(arr, key));

        // 9. Bubble Sort Algorithm
        System.out.println("Sorted Array using Bubble Sort: ");
        bubbleSort(arr);
        printArray(arr);

        sc.close();
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the minimum element in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method to check if an array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to find factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to find GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method for Binary Search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Element not found
    }

    // Method for Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    // Helper Method to Print an Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
