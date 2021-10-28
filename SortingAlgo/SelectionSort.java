package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 59 ,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr){
        for(int i=0; i < arr.length; i++){
            int last = arr.length - 1 - i;
            int currentMaxIndex = getMaxOfArr(arr, last);
            swap(arr, currentMaxIndex, last);
        }
        return arr;
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static int getMaxOfArr(int[] arr, int last) {
        int max = 0;
        for (int i=0; i<last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
