package Programming.laba9.task2.task3;

import java.util.NoSuchElementException;

public class ArrayByteExceptions {
    private byte length;
    private byte ByteArray [] = new byte[length];
//    метод создания массива типа Byte и вычисление суммы его элементов
    public void GetByteArray (byte length) throws NoSuchElementException {
       if (length>16){
           throw new NoSuchElementException();
       }
        ByteArray=new byte[length];
        for (byte i=0;i< ByteArray.length;i++){
            ByteArray[i]=i;
            System.out.print(" "+ByteArray[i]);
        }
        byte counter=0;
        for (byte i=0;i<ByteArray.length;i++){
            counter=(byte)(counter+ByteArray[i]);
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна "+counter);
    }
}
