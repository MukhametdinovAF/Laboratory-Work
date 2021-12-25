package Timus;

import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        if (n > k) {
            if ((n * 2) % k == 0) {
                count = (n * 2 / k);
            } else if ((n * 2) % k != 0) {
                count = (n * 2 / k) + 1;
            }
            System.out.println(count);
        }
        else if (n<=k) {
            count = 2;
            System.out.println(count);
        }
    }
}
