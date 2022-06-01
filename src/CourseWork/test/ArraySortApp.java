package CourseWork.test;



import java.util.Arrays;
import java.util.Scanner;
import java.time.*;



import java.util.InputMismatchException;

public class ArraySortApp {
    public static void main(String[] args) {
        boolean finish=true;
        while (finish){
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите количество случайных чисел");
                int i = in.nextInt();
                in.nextLine();
                RandomInsert ri = new RandomInsert(i);
                ri.randomInsert(i, ri);
                long[] arrayCopy = ri.randomInsert(i, ri);
                String answer;
                System.out.println("Массив случайных чисел выглядит следующим образом:");
                    ri.display(arrayCopy);

                boolean sorting=true;
                while (sorting) {
                    System.out.println("Какой метод сортировки хотите использовать?");
                    System.out.println("1. Сортировка пузырьком");
                    System.out.println("2. Сортировка вставками");
                    System.out.println("3. Сортировка выбором");

                    int sortingMethod = in.nextInt();
                    in.nextLine();
                    if (sortingMethod<0||sortingMethod>3){
                        sortingMethod = in.nextInt();
                    }
                    switch (sortingMethod) {
                        case 1 -> {
                            long[] arrayCopy1 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startBub = Instant.now();
                            ArrayBub.bubbleSort(arrayCopy1);
                            Instant stopBub = Instant.now();
                            long elapsedBub = Duration.between(startBub, stopBub).toMillis();
                            System.out.println("Отсортированный массив выглядит следующим образом:");
                            ri.display(arrayCopy1);
                            System.out.println("Время работы алгоритма сортировки составляет " + elapsedBub + " миллисекунд");
                            System.out.println("Записать результат работы алгоритма в файл?(да/нет)");
                            answer = in.nextLine();
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                ArrayBub.writeToTxtUnsorted(arrayCopy);
                                ArrayBub.writeToTxtSorted(arrayCopy1);
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                break;
                            } else {
                                System.out.println("Хотите завершить?(да/нет)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "да":finish = false;
                                    case "нет":break;
                                    case "lf":finish = false;
                                    case "yes":finish = false;
                                    case "ytn":break;
                                }

                                sorting = false;

                            }
                        }
                        case 2 -> {
                            long[] arrayCopy2 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startIns = Instant.now();
                            ArrayIns.insertionSort(arrayCopy2);
                            Instant stopIns = Instant.now();
                            long elapsedIns = Duration.between(startIns, stopIns).toMillis();
                            System.out.println("Отсортированный массив выглядит следующим образом:");
                            ri.display(arrayCopy2);
                            System.out.println("Время работы алгоритма сортировки составляет " + elapsedIns + " миллисекунд");
                            System.out.println("Записать результат работы алгоритма в файл?(да/нет)");
                            answer = in.nextLine();
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                ArrayIns.writeToTxtUnsorted(arrayCopy);
                                ArrayIns.writeToTxtSorted(arrayCopy2);
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                break;
                            } else {
                                System.out.println("Хотите завершить?(да/нет)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "да":finish = false;
                                    case "нет":break;
                                    case "lf":finish = false;
                                    case "yes":finish = false;
                                    case "ytn":break;

                                }
                                sorting = false;

                            }
                        }
                        case 3 -> {
                            long[] arrayCopy3 = Arrays.copyOf(arrayCopy, arrayCopy.length);
                            Instant startSel = Instant.now();
                            ArraySel.selectionSort(arrayCopy3);
                            Instant stopSel = Instant.now();
                            long elapsedSel = Duration.between(startSel, stopSel).toMillis();
                            System.out.println("Отсортированный массив выглядит следующим образом:");
                            ri.display(arrayCopy3);
                            System.out.println("Время работы алгоритма сортировки составляет " + elapsedSel + " миллисекунд");
                            System.out.println("Записать результат работы алгоритма в файл?(да/нет)");
                            answer = in.nextLine();
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                ArraySel.writeToTxtUnsorted(arrayCopy);
                                ArraySel.writeToTxtSorted(arrayCopy3);
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            } else {
                                System.out.println("Хотите отсортировать этот же массив случайных чисел другим методом?(да/нет)");
                                answer = in.nextLine();
                            }
                            if (answer.equals("да")||answer.equals("lf")||answer.equals("yes")||answer.equals("Да")) {
                                break;
                            } else {
                                System.out.println("Хотите завершить?(да/нет)");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "да":finish = false;
                                    case "нет":break;
                                    case "lf":finish = false;
                                    case "yes":finish = false;
                                    case "ytn":break;
                                }
                                sorting = false;

                            }
                        }
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
