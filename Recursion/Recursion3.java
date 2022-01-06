package Recursion;

import java.util.Random;
import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 9};
//        System.out.println(sortOrNot(arr, 0));
        System.out.println(linearSearch(arr, 9));
        System.out.println(linearSearchWithRecursion(arr, -1, 0));
        System.out.println(test(29));

    }

    static boolean sortOrNot(int[] arr){
        int i = 0;
        while (i < arr.length - 1){
            if (check(arr ,i)){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }

    static boolean check(int[] arr , int i){
        return arr[i] < arr[i+1];
    }

    static boolean sortOrNot(int[] arr, int i){
        if (arr.length - 1 == i) {
            return true;
        }
        return arr[i] < arr[i+1] && sortOrNot(arr, i+1);
    }

    static  int numberOfAttemps(){
        Random rn = new Random();
        int n = rn.nextInt(20);
        System.out.println(n);
        int count = 0;
        while(true){
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (n == a){
                System.out.println("YOu entered correct Number ");
                break;
            }
            count++;
        }
        return count;
    }

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length;  i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchWithRecursion(int[] arr, int target, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target){
            return i;
        }else{
            return linearSearchWithRecursion(arr, target, i+1);
        }
    }

    static int test(int a){
        int ans = 0;
        while (a != 0){
            int temp = a % 4;
            ans = (ans * 10) + temp;
            a /= 4;
        }
        return ans;
    }
}