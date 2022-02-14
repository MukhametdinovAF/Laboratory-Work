package Programming.laba8.hometask4;

public class Main { // ГЛАВНЫЙ КЛАСС
        public static void main(String[] args) {
// создание несвязанных узлов с помощью конструктора
            Example4 node0 = new Example4(0, null); // 0-й узел – будет головой в списке
            Example4 node1 = new Example4(1, null);
            Example4 node2 = new Example4(2, null);
            Example4 node3 = new Example4(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
            node0.next = node1;
            node1.next = node2;
            node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,
// соответствующей текущему значению ссылки при прохождении по списку
            Example4 ref = node0; // для перемещения по списку достаточно помнить голову
            while (ref != null) {
                System.out.print(" " + ref.value);
                ref = ref.next;
            }
        }
}


