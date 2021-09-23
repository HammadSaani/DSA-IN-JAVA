package LinearSearchAlgo;
// For Binary Search, array should be sorted
public class BinarySearch {
    public static void main(String[] args) {
        int target = 19;
        int[] arr = {3, 12, 16, 19, 22, 25, 29, 34, 39};
        int[] arr2 = {39, 34, 25, 22, 19, 16, 12, 3};
        if (arr[arr2.length -1] > arr2[0]){
            System.out.println(Assending(target, arr));
        }else{
            System.out.println(Desending(target, arr));
        }
    }

    static boolean Assending(int num, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // This can exceed int range. So, can also be written as (start) - ((end - start)/2)
            if (arr[mid] == num){
                System.out.println("Index is " + mid);
                return true;
            }else if(num > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean Desending(int num, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // This can exceed int range. So, can also be written as (start) - ((end - start)/2)
            if (num == arr[mid]) {
                return true;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return false;
    }
}

