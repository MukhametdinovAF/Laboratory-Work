package Programming.laba4.hometask5;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int[][] array = new int[4][8];
        int i;
        int j;
        Random random = new Random();
        for (i=0;i< array.length;i++){
            for (j=0;j<array[i].length;j++){
                array[i][j]=random.nextInt(9);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int [][] numbers=new int[8][4];
        for (i=0;i< numbers.length;i++){
            for (j=0;j<numbers[i].length;j++){
                numbers[i][j]= array[j][i];
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
