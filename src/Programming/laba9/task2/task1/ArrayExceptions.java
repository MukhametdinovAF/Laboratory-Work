package Programming.laba9.task2.task1;

public class ArrayExceptions {
    private int ArrayLength;
    private int [] ArrayOfInts = new int [ArrayLength];

    public int getArrayLength() {
        return ArrayLength;
    }

    public void setArrayLength(int arrayLength) {
        ArrayLength = arrayLength;
    }

    public int[] getArrayOfInts() {
        return ArrayOfInts;
    }

    public void setArrayOfInts(int[] arrayOfInts) {
        ArrayOfInts = arrayOfInts;
    }
    public void GetNewArray (int ArrayLength) {
        this.ArrayLength = ArrayLength;
        ArrayOfInts = new int[ArrayLength];
        for (int i = 0; i < ArrayOfInts.length; i++) {
            ArrayOfInts[i] = i;
            System.out.print(" " + ArrayOfInts[i]);
        }
        int counter = 0;
        for (int i = 0; i < ArrayOfInts.length; i++) {
            counter = counter + ArrayOfInts[i];
        }
        System.out.println();
        System.out.println("Среднее значение среди элементов массива равно: " + counter / ArrayOfInts.length);
    }
}
