package Programming.laba3.hometask7;

public class Example7 {
    public static void main(String[] args) {
        int a = 10;
        char[] arr = new char[a];
        for (int i = 0;i< arr.length ; i++) {
            arr[i]= (char) (97+2*i);
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[9-i]);
        }
    }
}
