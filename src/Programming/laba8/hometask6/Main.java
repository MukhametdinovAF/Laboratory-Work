package Programming.laba8.hometask6;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите необходимое количество чисел для формирования списка ");
        int value = in.nextInt();
//      //Создание списка с головы:
//        Example6 head = Example6.createHead(value);
//        Example6.toStringMethod("CreateHead",head);
//      //Создание списка с хвоста:
//        Example6 head =Example6.createTail(value);
//        Example6.toStringMethod("Create tail",head);
//      //Добавление элемента в начало списка:
//        Example6 newHead = Example6.AddFirst(head,150);
//        Example6.toStringMethod("AddFirst",newHead);
//      // Добавление элемента в конец списка:
//        Example6.AddLast(head,123);
//        Example6.toStringMethod("AddLast",head);
//      // Вставка элемента в указанное место
//        Example6.Insert(head,196,3);
//        Example6.toStringMethod("Insert",head);
//      // Удаление первого элемента списка
//        Example6 newHeadAfterRemove=Example6.RemoveFirst(head);
//        Example6.toStringMethod("RemoveFirst",newHeadAfterRemove);
//      // Удаление последнего элемента списка
//        Example6.RemoveLast(head);
//        Example6.toStringMethod("RemoveLast",head);
//      // Удаление заданного элемента:
//        Example6.Remove(head,4);
//        Example6.toStringMethod("Remove",head);
//      // Ввод с головы помощью рекурсии:
//        Example6 head=new Example6(0,null);
//        Example6 tail = head;
//        Example6.createHeadRec(head,tail,value);
//        Example6.toStringMethod("CreateHeadRec",head);
//      // Ввод с хвоста с помощью рекурсии:

        Example6 head=Example6.createTailRec(null,value);
        Example6.toStringMethod("CreateTailRec",head);
    }
}
