package Programming.laba4.hometask3;

public class Example3 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j<array[i].length; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
