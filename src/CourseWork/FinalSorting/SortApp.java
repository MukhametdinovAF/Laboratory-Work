package CourseWork.FinalSorting;
import CourseWork.Bubble.*;
import CourseWork.Insert.*;
import CourseWork.Select.*;
import java.time.Duration;
import java.time.Instant;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class SortApp {
    public static void main(String[] args) {
        boolean finish = true;
        while (finish) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите количество случайных чисел для сортировки");

                int i = in.nextInt();
                if (i < 0) {
                    System.out.println("Введите положительное целое число");
                    i = in.nextInt();
                }

                System.out.println("Какую сортировку применить?");
                System.out.println("Введите 1 для выбора сортировки пузырьком");
                System.out.println("Введите 2 для выбора сортировки вставками");
                System.out.println("Введите 3 для выбора сортировки выбором");

                int x = in.nextInt();
                if (x < 0 || x > 3) {
                    System.out.println("Введите целое положительное число от 1 до 3");
                    x = in.nextInt();
                }

                switch (x) {
                    case (1) -> {
                        Scanner arrayBubIn = new Scanner(System.in);
                        ArrayBub arrayBub = new ArrayBub(i);
                        System.out.println("Заполняем массив случайными числами:");
                        arrayBub.randomInsert(i, arrayBub);
                        System.out.println("Хотите записать массив случайных чисел в файл?");
                        String answerBub;
                        answerBub = arrayBubIn.nextLine();
                        if(Objects.equals(answerBub,"да")) {
                            arrayBub.WriteToTxtUnsorted();
                        }
                        arrayBub.display();
                        Instant startBub = Instant.now();
                        arrayBub.bubbleSort();
                        Instant finishBub = Instant.now();
                        long elapsedBub = Duration.between(startBub, finishBub).toMillis();
                        System.out.println("А вот так выглядит отсортированный массив:");
                        arrayBub.display();
                        System.out.println("Время работы программы: " + elapsedBub + " миллисекунд");
                        System.out.println("Хотите записать отсортированный массив в файл?");
                        answerBub = arrayBubIn.nextLine();
                        if(Objects.equals(answerBub,"да")) {
                            arrayBub.WriteToTxtSorted();
                        }
                        System.out.println("Хотите попробовать снова?");
                        answerBub=arrayBubIn.nextLine();
                        if(Objects.equals(answerBub,"нет")){
                            finish=false;
                        }
                    }
                    case (2) -> {
                        Scanner arrayInsIn = new Scanner(System.in);
                        ArrayIns arrayIns = new ArrayIns(i);
                        System.out.println("Заполняем массив случайными числами:");
                        arrayIns.randomInsert(i, arrayIns);
                        System.out.println("Хотите записать массив случайных чисел в файл?");
                        String answerIns=arrayInsIn.nextLine();
                        if(Objects.equals(answerIns,"да")){
                            arrayIns.WriteToTxtUnsorted();
                        }
                        arrayIns.display();
                        Instant startIns = Instant.now();
                        arrayIns.insertionSort();
                        Instant finishIns = Instant.now();
                        long elapsedIns = Duration.between(startIns, finishIns).toMillis();
                        System.out.println("А вот так выглядит отсортированный массив:");
                        arrayIns.display();
                        System.out.println("Время работы программы: " + elapsedIns + " миллисекунд");
                        System.out.println("Хотите записать отсортированный массив в файл?");
                        answerIns=arrayInsIn.nextLine();
                        if (Objects.equals(answerIns,"да")){
                            arrayIns.WriteToTxtSorted();
                        }
                        System.out.println("Хотите попробовать снова?");
                        answerIns=arrayInsIn.nextLine();
                        if(Objects.equals(answerIns,"нет")){
                            finish=false;
                        }

                    }
                    case (3) -> {
                        Scanner arraySelIn = new Scanner(System.in);
                        ArraySel arraySel = new ArraySel(i);
                        System.out.println("Заполняем массив случайными числами");
                        arraySel.randomInsert(i, arraySel);
                        System.out.println("Хотите записать массив случайных чисел в файл?");
                        String answerSel=arraySelIn.nextLine();
                        if (Objects.equals(answerSel,"да")){
                            arraySel.WriteToTxtUnsorted();
                        }
                        arraySel.display();
                        Instant startSel = Instant.now();
                        arraySel.selectionSort();
                        Instant finishSel = Instant.now();
                        long elapsedSel = Duration.between(startSel, finishSel).toMillis();
                        System.out.println("А вот так выглядит отсортированный массив:");
                        arraySel.display();
                        System.out.println("Время работы программы: " + elapsedSel + " миллисекунд");
                        System.out.println("Хотите записать отсортированный массив в файл?");
                        answerSel=arraySelIn.nextLine();
                        if (Objects.equals(answerSel,"да")){
                            arraySel.WriteToTxtSorted();
                        }
                        System.out.println("Хотите попробовать снова?");
                        answerSel=arraySelIn.nextLine();
                        if(Objects.equals(answerSel,"нет")){
                            finish=false;
                        }
                    }
                    default -> System.out.println("Неверно выбран номер. Перезапустите программу.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введены некорректные данные! Перезапустите программу.");
            }
        }
    }
}
