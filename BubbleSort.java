public class BubbleSort {
    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        // Perform Bubble Sort
        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

