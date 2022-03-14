package Programming.laba8.hometask6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите необходимое количество чисел для формирования списка ");
        int value = in.nextInt();
        Example6 myNode = new Example6(value,null);

        myNode.getMinAndMaxForThree(myNode);




    }
}
