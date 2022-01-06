package OPPRevision.Lambda;

import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        arr.forEach((n) -> System.out.println(n));
    }

}
