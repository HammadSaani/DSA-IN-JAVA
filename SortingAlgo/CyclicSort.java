package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 6};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            int correct = arr[i];
            int temp = arr[i];
            if (arr[i] != arr[temp - 1]){
                swap(arr,i, temp - 1);
            }

        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i){
//                return arr;
//            }
//        }
        return arr;
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
