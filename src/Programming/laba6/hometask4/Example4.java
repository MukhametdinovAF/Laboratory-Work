package Programming.laba6.hometask4;

public class Example4 {
    private int n;

    public static void doubleFactorial(int n) {
        int result = 1;
        for (int i = n; i >0; i=i-2) {
                result = result * i;
            }
            System.out.println(result);
        if (n==0){
            result=1;
        }
        else if(n==1){
            result=1;
        }
    }
    public static int doubleFactorialRecursion(int n){
        int res;
        res = (n - 2) * (doubleFactorialRecursion(n));
        return res;
            }
    }




//        Напишите программу, в которой описан статический метод для вычисления
//        двойного факториала числа, переданного аргументом методу. По определению, двойной
//        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
//        Предложите версию метода без рекурсии и с рекурсией.