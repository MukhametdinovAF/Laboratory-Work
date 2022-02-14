package Programming.laba8.hometask2;

public class Example2 {
    private int number;


    public void outputBinary (int number) {
        if(number/2>0){
            outputBinary(number/2);
        }
        System.out.print(number%2);
    }
}


//        Создать приложение с использованием рекурсии для перевода
//        целого числа, введенного с клавиатуры, в двоичную систему счисления.