package Programming.laba3.hometask8;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] arr = new char[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (66 + i);
        }
        if (arr[3] ==69) {
            arr[3] = 76;
            if (arr[7] == 73) {
                arr[7] = 77;
            }
            Arrays.sort(arr);
            for (char c : arr) {
                System.out.println(c);
            }
        }
    }
}
