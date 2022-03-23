package Programming.laba8.hometask3;

public class Example3 {

    public int [] arrayField;

    {
        arrayField = new int[5];
    }



    private int x=0;
    private int i=0;

    public void getArray(int [] array){
        try {
            if (x < array.length) {
                arrayField[x] = array[i];
                System.out.print(arrayField[x]+" ");
                x++;
                i++;
                getArray(array);

            }
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }


       }

       }


//        Создать приложение, позволяющее ввести и вывести
//        одномерный массив целых чисел. Для ввода и вывода массива
//        разработать рекурсивные методы вместо циклов for.