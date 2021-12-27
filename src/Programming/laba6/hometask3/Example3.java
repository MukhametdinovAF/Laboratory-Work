package Programming.laba6.hometask3;

import java.util.Arrays;

public class Example3 {
    private int[]pole1;



    public static void getArray (int[]pole1){
        for(int i = 0; i< pole1.length;i++){
            pole1[i]=i;
            System.out.println(pole1[i]);
        }

}


}



//        Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел.