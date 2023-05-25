package QuickSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 5, 2};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;

        if (low >= high) return;

        int middle = (low + high) / 2;
        int basic = array[middle];

        int i = low;
        int j = high;

        while (i < j) {
            while (array[i] < basic) {
                i++;
            }

            while (array[j] > basic) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (i < high) {
            quickSort(array, i, high);
        }
    }
}
