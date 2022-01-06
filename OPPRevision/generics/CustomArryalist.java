package OPPRevision.generics;//package OPPRevision.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CustomArryalist<T> {
    private Object[] arr;
    private int DEFAULT_SIZE = 10;
    private int size = 0;


    CustomArryalist(){
        this.arr = new Object[DEFAULT_SIZE];
    }

    void add(int num) {
        if (this.isFull()){
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        DEFAULT_SIZE *= 2;
        Object[] temp = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return DEFAULT_SIZE == size;
    }


    void display(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Random ran = new Random(1500);
        ArrayList<Integer> arrr = new ArrayList<Integer>();
        System.out.println(arrr);
        for (int i=0; i<10; i++) {

            arrr.add(ran.nextInt(100));

        }
        System.out.println(arrr);

    }
}


