package LinearSearchAlgo;

import java.util.Arrays;
//
//public class BinarySearchtwoD {
//    public static void main(String[] args) {
//        int[][] arr = {{10, 20, 30, 40},
//                        {15, 25, 31, 45},
//                        {28, 29, 32, 49}};
//        int target = 31;
//        System.out.println(Arrays.toString(search(arr, target)));
//    }
//    static int[] search(int[][] arr, int target){
//            int row = 0;
//            int col = arr.length - 1;
//            while(row < arr.length &&  col >=0){
//                if (arr[row][col] == target){
//                    return new int[] {row, col};
//                }else if(target < arr[row][col]){
//                    col--;
//                }else{
//                    row++;
//                }
//        }
//            return new int[] {-1,-1};
//    }
//}

class Solution {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}};
        BinarySearchtwoD(arr, 3);
    }

    static boolean BinarySearchtwoD(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = (row * col) - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (matrix[mid/col][mid%row] == target){
                return true;
            }else if(matrix[mid/col][mid%row] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}

