package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i < nums.length; i++){
            result.add(index[i], nums[i]);
        }
        for (int i=0; i < nums.length; i++){
            target[i] = result.get(i);
        }
        System.out.println(result);
    }
}