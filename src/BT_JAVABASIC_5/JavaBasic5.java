package BT_JAVABASIC_5;

import java.util.ArrayList;
import java.util.List;

public class JavaBasic5 {

    public static void main(String[] args) {
        // Xử lý bài tập javaBasic4 với arrayList
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i ++) {
            arr.add(i);
        }
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
