package LinearSearchAlgo;

public class OptimizedBS {
    public static void main(String[] args) {
        int[] arr = {39, 34, 25, 22, 19, 16, 12, 3};
        int target = 19;
        boolean isAsc = isAsc(arr);
        System.out.println(isFound(target, arr, isAsc));

    }
    static boolean isAsc(int[] arr) {
        return arr[arr.length - 1] > arr[0];
    }

    static boolean isFound(int target, int[] arr, boolean isAsc){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ((end - start)/2) ;
            if (arr[mid] == target) {
                System.out.println("Index is " + mid);
                return true;
            }else if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if (target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            }
        }
        return false;
    }
}