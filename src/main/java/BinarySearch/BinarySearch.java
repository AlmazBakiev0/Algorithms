package BinarySearch;

import QuickSort.QuickSort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 5, 2};
        int low = 0;
        int high = array.length - 1;
        QuickSort.quickSort(array, low, high);
        binarySearch(array, low, high, 5);
    }

    public static void binarySearch(int[] array, int low, int high, int desiredNumber) {
        while (low <= high) {
            int middle = (low + high) / 2;
            int centerNumber = array[middle];

            if (centerNumber == desiredNumber) {
                System.out.println("Number found");
                return;
            }

            if (centerNumber > desiredNumber) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Number not found");
    }
}
