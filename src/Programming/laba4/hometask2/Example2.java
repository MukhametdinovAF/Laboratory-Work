package Programming.laba4.hometask2;

public class Example2 {
    public static void main(String[] args) {
        int triangle = 10;
        int i;
        int j;
        int z;
        for (i=0;i<triangle;i++){
            System.out.print("номер строки "+i+" ");
            z=0;
            for (j=0; j<=i;j++){
                System.out.print("+");
                z++;
            }
            System.out.println("количество символов "+z);
        }

    }
}
