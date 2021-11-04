package SortingAlgo;

class Solution {
    public int[] cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i];
            if (arr[i] != arr[correct] && arr[i] < arr.length){
                swap(arr, i, correct);
            }

        }
        return arr;
    }

    void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}