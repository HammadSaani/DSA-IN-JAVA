package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 2, 6};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i];
            if (arr[i] != arr[correct - 1]){
                swap(arr, arr[i], arr[correct-1]);
            }

        }
        return arr;
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
